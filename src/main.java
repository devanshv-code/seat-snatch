import java.sql.*;

public class main {
    public static void main(String[] args) {

        String url = "jdbc:postgresql://localhost:8000/ride";
        String user = "postgres";
        String password = "dev123";

        String query = "SELECT * FROM user1";

        try {
            Connection con = DriverManager.getConnection(url, user, password);
            Statement stmt = con.createStatement();
            ResultSet rs = stmt.executeQuery(query);

            while (rs.next()) {
                System.out.println(
                        rs.getInt("id") + " | " +
                                rs.getString(2) + " | " +
                                rs.getString(3) + " | " +
                                rs.getString("password")
                );
            }

            con.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}


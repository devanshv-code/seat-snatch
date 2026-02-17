import java.sql.*;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class RideBookingSystem {

    static final String URL = "jdbc:postgresql://localhost:8000/ride";
    static final String USER = "postgres";
    static final String PASS = "dev123";

    static Connection getConn() throws SQLException {
        return DriverManager.getConnection(URL, USER, PASS);
    }

    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        while (true) {
            System.out.println("\n===== CAR POOLING SYSTEM =====");
            System.out.println("1) Register");
            System.out.println("2) Login");
            System.out.println("3) Exit");
            System.out.print("Choose: ");

            int choice = Integer.parseInt(sc.nextLine().trim());

            if (choice == 1) registerUser();
            else if (choice == 2) loginFlow();
            else if (choice == 3) {
                System.out.println("Bye!");
                break;
            } else {
                System.out.println("Invalid choice!");
            }
        }
    }

    static void registerUser(){
        System.out.println("\n--- Register ---");
        System.out.print("Username: ");
        String username = sc.nextLine().trim();

        System.out.print("Password: ");
        String password = sc.nextLine().trim();

        System.out.print("Gmail: ");
        String gmail = sc.nextLine().trim();

        String sql = "INSERT INTO user1(username, password, gmail) VALUES (?, ?, ?)";

        try (Connection con = getConn();
             PreparedStatement ps = con.prepareStatement(sql)) {

            ps.setString(1, username);
            ps.setString(2, password);
            ps.setString(3, gmail);

            ps.executeUpdate();
            System.out.println("Registered successfully!");

        } catch (SQLException e) {
            System.out.println("Registration failed: " + e.getMessage());
        }

    }
    static void loginFlow(){
        System.out.println("\n--- Login ---");
        System.out.print("Username: ");
        String username = sc.nextLine().trim();

        System.out.print("Password: ");
        String password = sc.nextLine().trim();

        String sql = "SELECT id, username FROM user1 WHERE username=? AND password=?";

        try (Connection con = getConn();
             PreparedStatement ps = con.prepareStatement(sql)) {

            ps.setString(1, username);
            ps.setString(2, password);

            try (ResultSet rs = ps.executeQuery()) {
                if (rs.next()) {
                    int userId = rs.getInt("id");
                    String uname = rs.getString("username");
                    System.out.println("Login successful! Welcome " + uname);
                    //userMenu(userId, uname);
                } else {
                    System.out.println("Wrong username/password!");
                }
            }

        } catch (SQLException e) {
            System.out.println("Login error: " + e.getMessage());
        }

    }


}
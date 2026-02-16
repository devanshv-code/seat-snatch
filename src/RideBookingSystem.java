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

            int choice = sc.nextInt();

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

    }
    static void loginFlow(){

    }
}
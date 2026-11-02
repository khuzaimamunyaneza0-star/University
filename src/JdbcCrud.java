import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class JdbcCrud {

    public static void main(String[] args) {
        try {
            Connection connection = DriverManager.getConnection(
                    "jdbc:postgresql://localhost:5432/University", "postgres", "123");
            System.out.println("Connected successfully");
            connection.close();
        } catch (SQLException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.sql.SQLException;

class DatabaseDemo {
    // JDBC URL, username, and password for MySQL database
    static final String DB_URL = "jdbc:mysql://localhost:3306/testdb"; // Change to your DB
    static final String USER = "root"; // Replace with your username
    static final String PASS = "password"; // Replace with your password

    public static void main(String[] args) {
        try (Connection conn = DriverManager.getConnection(DB_URL, USER, PASS);
             Statement stmt = conn.createStatement()) {

            // 1. Create a table
            String createTableSQL = "CREATE TABLE IF NOT EXISTS employees (" +
                    "id INT AUTO_INCREMENT PRIMARY KEY," +
                    "name VARCHAR(100) NOT NULL," +
                    "position VARCHAR(100) NOT NULL," +
                    "salary DOUBLE)";
            stmt.executeUpdate(createTableSQL);
            System.out.println("Table 'employees' created successfully.");

            // 2. Insert records into the table
            String insertSQL = "INSERT INTO employees (name, position, salary) VALUES " +
                    "('Alice', 'Manager', 70000.00)," +
                    "('Bob', 'Developer', 50000.00)," +
                    "('Charlie', 'Analyst', 45000.00)";
            stmt.executeUpdate(insertSQL);
            System.out.println("Records inserted successfully.");

            // 3. Delete a record from the table
            String deleteSQL = "DELETE FROM employees WHERE name = 'Bob'";
            int rowsAffected = stmt.executeUpdate(deleteSQL);
            System.out.println("Deleted " + rowsAffected + " record(s) successfully.");
            
            ResultSet rs=stmt.executeQuery("SELECT * FROM employees");
            System.out.println(rs);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}

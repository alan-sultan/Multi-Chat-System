
import java.net.ServerSocket;
import java.sql.Connection;
import java.sql.DriverManager;

public class TestServer {

    public static void main(String[] args) {
        try {
            // Test MySQL connection
            System.out.println("Testing MySQL connection...");
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306", "root", "");
            System.out.println("MySQL connection successful!");
            conn.close();

            // Test server socket
            System.out.println("Testing server socket on port 5000...");
            ServerSocket serverSocket = new ServerSocket(5000);
            System.out.println("Server socket created successfully!");
            serverSocket.close();

            System.out.println("All tests passed! Now try running the actual server.");
        } catch (Exception e) {
            System.out.println("Test failed!");
            e.printStackTrace();
        }
    }
}

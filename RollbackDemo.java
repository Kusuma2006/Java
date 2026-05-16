import java.sql.*;

public class RollbackDemo {

    public static void main(String[] args) {

        String url = "jdbc:mysql://localhost:3306/accounts";
        String user = "root";
        String pass = "cec123";

        Connection conn = null;

        try {

            // 1. Create connection
            conn = DriverManager.getConnection(url, user, pass);

            // 2. Disable auto commit
            conn.setAutoCommit(false);

            // 3. Create statement
            Statement stmt = conn.createStatement();

            // 4. Debit ₹500 from account 1
            stmt.executeUpdate(
                "UPDATE accounts SET balance = balance - 500 WHERE id = 1"
            );

            // 5. Wrong query (table name mistake)
            stmt.executeUpdate(
                "UPDATE accnts SET balance = balance + 500 WHERE id = 2"
            );

            // 6. Save changes
            conn.commit();

            System.out.println("Transaction Successful!");

        } catch (SQLException e) {

            try {

                // Undo all changes
                if (conn != null) {
                    conn.rollback();
                }

                System.out.println("Transaction Successfull!");

            } catch (SQLException ex) {

                System.out.println("Rollback Failed!");
            }
        }
    }
}
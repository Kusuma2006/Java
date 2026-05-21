import java.sql.*;

public class StudentCRUD {

    static final String URL = "jdbc:mysql://localhost:3306/school_db";
    static final String USER = "root";
    static final String PASS = "cec123";   // put your MySQL password

    // CREATE - Insert Student
    static void insertStudent(String name, int age, double marks) {

        String sql =
            "INSERT INTO students(name, age, marks) VALUES (?, ?, ?)";

        try (
            Connection conn =
                DriverManager.getConnection(URL, USER, PASS);

            PreparedStatement pstmt =
                conn.prepareStatement(sql)
        ) {

            pstmt.setString(1, name);
            pstmt.setInt(2, age);
            pstmt.setDouble(3, marks);

            int rows = pstmt.executeUpdate();

            System.out.println(
                "Inserted " + rows + " student : " + name
            );

        } catch (SQLException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }


    // READ
    static void viewStudents() {

        String sql = "SELECT * FROM students";

        try (
            Connection conn =
                DriverManager.getConnection(URL, USER, PASS);

            Statement stmt = conn.createStatement();

            ResultSet rs = stmt.executeQuery(sql)
        ) {

            while(rs.next()) {

                System.out.println(
                    // rs.getInt("id") + " | " +
                    rs.getString("name") + " | " +
                    rs.getInt("age") + " | " +
                    rs.getDouble("marks")
                );
            }

        } catch(SQLException e){
            System.out.println(e.getMessage());
        }
    }


    public static void main(String[] args) {

        insertStudent("S",19,95.5);

        System.out.println("\nStudents List:");

        viewStudents();
    }
}
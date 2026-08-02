import java.sql.*;

public class JdbcCRUD {
    public static void main(String[] args) {

        String url = "jdbc:mysql:
        String user = "root";
        String password = "root"; 
        try {
            
            Class.forName("com.mysql.cj.jdbc.Driver");

            
            Connection con = DriverManager.getConnection(url, user, password);

            String insert = "INSERT INTO students (id, name, age) VALUES (?, ?, ?)";
            PreparedStatement ps = con.prepareStatement(insert);
            ps.setInt(1, 1);
            ps.setString(2, "Madhu");
            ps.setInt(3, 21);
            ps.executeUpdate();
            System.out.println("Inserted Successfully!");

                        Statement stmt = con.createStatement();
            ResultSet rs = stmt.executeQuery("SELECT * FROM students");

            System.out.println("\nStudent Records:");
            while (rs.next()) {
                System.out.println(
                        rs.getInt("id") + " " +
                        rs.getString("name") + " " +
                        rs.getInt("age"));
            }

            String update = "UPDATE students SET age=? WHERE id=?";
            PreparedStatement ps2 = con.prepareStatement(update);
            ps2.setInt(1, 22);
            ps2.setInt(2, 1);
            ps2.executeUpdate();
            System.out.println("\nUpdated Successfully!");

            String delete = "DELETE FROM students WHERE id=?";
            PreparedStatement ps3 = con.prepareStatement(delete);
            ps3.setInt(1, 1);
            ps3.executeUpdate();
            System.out.println("Deleted Successfully!");

            con.close();

        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
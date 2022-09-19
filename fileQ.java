import java.sql.*;

class fileQ {
    public static void main(String args[]) {
        try {
            // Register JDBC driver

            Class.forName("com.mysql.jdbc.Driver");

            // get a connection to a database

            System.out.println("Connecting to a selected database...");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/first","root", "root");

            // here 'first' is database name, 'root' is username and password

            System.out.println("Connected database successfully...");

            // Execute a query

            Statement stmt = con.createStatement();
            ResultSet r1 = stmt.executeQuery("select * from tb");
            while (r1.next()) {
                System.out.println(r1.getInt(1) + " " + r1.getString(2));
            }

            //Adding 1 row

            System.out.println("AFTER ADDING 1 ROW.....");
            String s="insert into tb values(16,'sandy')";
            stmt.executeUpdate(s);
            r1 = stmt.executeQuery("select * from tb");
            while (r1.next()) {
                System.out.println(r1.getInt(1) + " " + r1.getString(2));
            }

            //Deleting 1 row

            System.out.println("AFTER DELETING 1 ROW.....");
            s="delete from tb where name='sandy'";
            stmt.executeUpdate(s);
            r1 = stmt.executeQuery("select * from tb");
            while (r1.next()) {
                System.out.println(r1.getInt(1) + " " + r1.getString(2));
            }

            con.close();

        } catch (Exception e) {
            System.out.println(e);
        }
    }
}

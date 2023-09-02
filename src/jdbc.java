import java.sql.*;

public class jdbc {
    public static void main(String[] args) throws SQLException, ClassNotFoundException {
        Class.forName ("com.mysql.cj.jdbc.Driver");
        Connection c= DriverManager.getConnection ("jdbc:mysql//localhost/avadhut ","root","8484010173");
        Statement st=c.createStatement ();
        ResultSet rs=st.executeQuery ("select * from studentinfo");
        while(rs.next ()){
            int ID=rs.getInt (1);
            String name=rs.getString (2);
                int age=rs.getInt (3);
        String city=rs.getString (4);
            System.out.println (ID );
            System.out.println (name);
            System.out.println (age);
            System.out.println (city);
        }
    }
}

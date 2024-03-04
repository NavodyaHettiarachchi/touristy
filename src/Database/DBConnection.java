package Database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

/**
 *
 * @author Navo
 */
public class DBConnection {

    private static Connection Conn;
    private static Statement state;

    public static Connection connectDB() {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            if (Conn == null) {
                Conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/touristy?zeroDateTimeBehavior=convertToNull", "root", "");
                state = Conn.createStatement();
                System.out.println("Successfully connected");
            }

        } catch (Exception ex) {
            ex.printStackTrace();
        }
        return Conn;
    }

    public static ResultSet search(String qry) throws Exception {
        Connection con = connectDB();
        PreparedStatement ps = con.prepareStatement(qry);
        return ps.executeQuery();
    }

}

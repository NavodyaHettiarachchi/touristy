package Database;

import CommonClasses.AdminUser;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

/**
 *
 * @author Navo
 */
public class DBCheckUsername {
    public static Connection Conn;
    public static AdminUser ad;
    public static boolean CheckUsername (String username) {
        Conn = Database.DBConnection.connectDB();
        try {
            String sql = "SELECT * FROM admin WHERE name = ?";
            PreparedStatement ps = Conn.prepareStatement(sql);
            ps.setString(1, username);
            ResultSet rs = ps.executeQuery();
            
            if (!rs.isBeforeFirst()) {
                return false;
            } else {
                return true;
            }
        } catch (Exception ex) {
            System.out.println("Failed");
            ex.printStackTrace();
        }
        return false;
    }
}

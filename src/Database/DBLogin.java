package Database;

import CommonClasses.AdminUser;
import java.awt.Image;
import java.awt.image.BufferedImage;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

/**
 *
 * @author Navo
 */
public class DBLogin {
    public static Connection Conn;
    private static BufferedImage format = null;
    private static ImageIcon formatImg = null;
    public static AdminUser ad;
    
    public static AdminUser login (String name, String pass) {
        Conn = Database.DBConnection.connectDB();
        // logging in the user
        try {
            
            boolean isAvailable = Database.DBCheckUsername.CheckUsername(name);
            if (isAvailable) {
                String sql = "SELECT name, profile_pic FROM admin WHERE name = ? AND password = ? ";
                
                PreparedStatement ps = Conn.prepareStatement(sql);
                ps.setString(1, name);
                ps.setString(2, pass);
                ResultSet rs = ps.executeQuery();

                if (rs.next()) {
                    byte[] imageData = rs.getBytes("profile_pic");
                    formatImg = new ImageIcon(imageData);
                    Image img = formatImg.getImage();
                    format = CommonClasses.convertToBufferedImage.convertToBufferedImage(img);
                    ad = new AdminUser(rs.getString(1), format);
                } else {
                    JOptionPane.showMessageDialog(null, "Username or Password is incorrect");
                    System.out.println("Username or Password Wrong");
                    return null;
                }
                return ad;
            } else {
                JOptionPane.showMessageDialog(null, "Username or Password is incorrect");
                System.out.println("Username doesnt exit");
                return null;
            }
        } catch (SQLException ex) {
            System.out.println("Error logging in");
            ex.printStackTrace();
        } 
        return null;
    }
}

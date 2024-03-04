package Database;

import CommonClasses.AdminUser;
import java.awt.Image;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.FileInputStream;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.ImageIcon;

/**
 *
 * @author Navo
 */
public class DBAdmin {
    public static Connection Conn;
    private static BufferedImage format = null;
    private static ImageIcon formatImg = null;
    
    public static AdminUser[] getAdmins() {
        AdminUser[] adArr = new AdminUser[0];
        try {
            String sql = "SELECT id, name, password FROM admin";
            ResultSet rs = Database.DBConnection.search(sql);
            while (rs.next()) {
                AdminUser ad = new AdminUser(rs.getInt(1), rs.getString(2), rs.getString(3));
                int n = adArr.length;
                AdminUser[] newArr = new AdminUser[n + 1];
                for (int i = 0; i < n; i++) {
                    newArr[i] = adArr[i];
                }
                newArr[n] = ad;
                adArr = newArr;
            }

        } catch (Exception ex) {
            System.out.println("Failed to query");
            ex.printStackTrace();
        }

        return adArr;
    }
    
    public static BufferedImage getAdminProfilePic (int id) {
        Conn = Database.DBConnection.connectDB();
        String sql = "SELECT profile_pic FROM admin WHERE id = ?";
        try {
            PreparedStatement ps = Conn.prepareStatement(sql);
            ps.setInt(1,id);
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                byte[] imageData = rs.getBytes("profile_pic");
                ImageIcon formatImg = new ImageIcon(imageData);
                Image img = formatImg.getImage();
                format = CommonClasses.convertToBufferedImage.convertToBufferedImage(img);
            }
            return format;
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        return null;
    }
    
    public static String getAdminPassword (int id) {
        Conn = Database.DBConnection.connectDB();
        String sql = "SELECT password FROM admin WHERE id = ?";
        try {
            PreparedStatement ps = Conn.prepareStatement(sql);
            ps.setInt(1,id);
            ResultSet rs = ps.executeQuery();
            String str = null;
            if (rs.next()) {
                str = rs.getString(1);
            }
            return str;
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        return null;
    }
    
    public static void addAdmin (String name, String pass, String filePath) {
        Conn = Database.DBConnection.connectDB();
        FileInputStream fs=null;
        PreparedStatement st = null;
        try {
            if (!Database.DBCheckUsername.CheckUsername(name)) {
                File f = new File(filePath);
                fs = new FileInputStream(f);
                String sql = "INSERT INTO admin(`name`, `password`, `profile_pic`) VALUES (?, ? ,?)";
                st = Conn.prepareStatement(sql);
                st.setString(1,name);
                st.setString(2, pass);
                st.setBinaryStream(3,fs,(int) f.length());
                st.executeUpdate();
            }
        } catch (Exception ex) {
            System.out.println("Cannot Connect to DB");
            ex.printStackTrace();
        }
    }
    
    public static void addAdmin (String name, String pass) {
        Conn = Database.DBConnection.connectDB();
        PreparedStatement st = null;
        try {
            if (!Database.DBCheckUsername.CheckUsername(name)) {
                String sql = "INSERT INTO admin(`name`, `password`) VALUES (?, ?)";
                st = Conn.prepareStatement(sql);
                st.setString(1,name);
                st.setString(2, pass);
                st.executeUpdate();
            }
        } catch (Exception ex) {
            System.out.println("Cannot Connect to DB");
            ex.printStackTrace();
        } 
    }
    
    public static void updateAdmin (String name, String pass, String filePath, int id) {
        Conn = Database.DBConnection.connectDB();
        FileInputStream fs=null;
        PreparedStatement st = null;
        try {   
            File f = new File(filePath);
            fs = new FileInputStream(f);
            String sql = "UPDATE admin SET name = ?, password = ?, profile_pic = ? WHERE id = ?";
            st = Conn.prepareStatement(sql);
            st.setString(1,name);
            st.setString(2, pass);
            st.setBinaryStream(3,fs,(int) f.length());
            st.setInt(4, id);
            st.executeUpdate();
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }
    
    public static void updateAdmin (String name, String pass, int id) {
        Conn = Database.DBConnection.connectDB();
        PreparedStatement ps = null;
        try { 
            String sql = "UPDATE admin SET name = ?, password = ? WHERE id = ?";
            ps = Conn.prepareStatement(sql);
            ps.setString(1,name);
            ps.setString(2, pass);
            ps.setInt(3, id);
            ps.executeUpdate();
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }
    
    public static void deleteAdmin (int id) {
        Conn = Database.DBConnection.connectDB();
        PreparedStatement st = null;
        try {
            String sql = "DELETE FROM admin WHERE id = ?";
            st = Conn.prepareStatement(sql);
            st.setInt(1, id);
            int i = st.executeUpdate();
            System.out.println(i + " Records deleted");
        } catch ( Exception ex ) {
            ex.printStackTrace();
        }
    }
    
    
}

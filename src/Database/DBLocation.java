package Database;

import CommonClasses.location;
import java.awt.Image;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

/**
 *
 * @author Navo
 */
public class DBLocation {
    public static Connection Conn;
    private static BufferedImage format = null;
    private static ImageIcon formatImg = null;
    String fname = null;
    int s = 0;
    byte[] pimage = null;
    
    public static location[] getLocations() {
        location[] arr = new location[0];
        try {
            // Getting the data
            String sql = "SELECT * FROM locations_added;";
            ResultSet rs = Database.DBConnection.search(sql);

            while (rs.next()) {
                // converting the image from longblob to buffered image
                byte[] imageData = rs.getBytes("image");
                formatImg = new ImageIcon(imageData);
                Image img = formatImg.getImage();
                format = CommonClasses.convertToBufferedImage.convertToBufferedImage(img);
                // creating the location object
                location ls = new location(rs.getString(1), format, rs.getString("description"));
                // adding location object to array

                int n = arr.length;
                location[] newArr = new location[n + 1];
                for (int i = 0; i < n; i++) {
                    newArr[i] = arr[i];
                }
                newArr[n] = ls;
                arr = newArr;
            }

        } catch (SQLException ex) {
            System.out.println("SQL Error.");
            ex.printStackTrace();
        } catch (Exception ex) {
            System.out.println("DB Connection Error");
            Logger.getLogger(DBLocation.class.getName()).log(Level.SEVERE, null, ex);
        }

        return arr;
    }

    public static location[] getLocationNames(){
        location[] arr = new location[0];
        Conn = Database.DBConnection.connectDB();
        try {
            // Getting the data
            String sql = "SELECT location FROM locations_added;";
            ResultSet rs = Database.DBConnection.search(sql);

            while (rs.next()) {
                location ls = new location(rs.getString(1));
                // adding location object to array
                int n = arr.length;
                location[] newArr = new location[n + 1];
                for (int i = 0; i < n; i++) {
                    newArr[i] = arr[i];
                }
                newArr[n] = ls;
                arr = newArr;
            }

        } catch (SQLException ex) {
            System.out.println("SQL Error.");
            ex.printStackTrace();
        } catch (Exception ex) {
            System.out.println("DB Connection Error.");
        }

        return arr;
    }

    public static location getLocationImage(String loc) {
        location[] arr = new location[0];
        Conn = Database.DBConnection.connectDB();
        try {

            // Getting the data
            String sql = "SELECT * FROM locations_added where location = ?;";
            PreparedStatement ps = Conn.prepareStatement(sql);
            ps.setString(1, loc);
            ResultSet rs = ps.executeQuery();
            location ls = null;
            while (rs.next()) {
                // converting the image from longblob to buffered image
                byte[] imageData = rs.getBytes("image");
                formatImg = new ImageIcon(imageData);
                Image img = formatImg.getImage();
                format = CommonClasses.convertToBufferedImage.convertToBufferedImage(img);
                // creating the location object
                ls = new location(rs.getString(1), format);
            }
            return ls;
        } catch (SQLException ex) {
            System.out.println("SQL Error.");
            ex.printStackTrace();
        }
        return null;
    }

    public static String getLocationDescription(String location) {
        location[] arr = new location[0];
        Conn = Database.DBConnection.connectDB();
        try {
            String sql = "SELECT description FROM location_description WHERE location = ?";
            PreparedStatement ps = Conn.prepareStatement(sql);
            ps.setString(1, location);
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                return rs.getString(1);
            } else {
                System.out.println("No Description");
                JOptionPane.showMessageDialog(null, "No Description");
            }
        } catch (SQLException ex) {
            System.out.println("Description Unavailable");
            ex.printStackTrace();
        }
        return null;
    }
    
    public static void addLocation (String location, String description, String filePath) {
        Conn = Database.DBConnection.connectDB();
        FileInputStream fs=null;
        PreparedStatement ps = null;
        location ls = getLocationImage(location);
        if (ls == null) {
            try {
                File f = new File(filePath);
                fs = new FileInputStream(f);
                String sql = "INSERT INTO locations_added(`location`, `image`) VALUES (?,?)";
                ps = Conn.prepareStatement(sql);
                ps.setString(1, location);
                ps.setBinaryStream(2,fs,(int) f.length());
                ps.executeUpdate();

                sql = "INSERT INTO location_description(`location`, `description`) VALUES (?,?)";
                ps = Conn.prepareStatement(sql);
                ps.setString(1, location);
                ps.setString(2, description);
                ps.executeUpdate();

            } catch (SQLException ex) {
                System.out.println("SQL Error.");
                ex.printStackTrace();
            } catch (FileNotFoundException ex) {
                System.out.println("File Not Found");
                ex.printStackTrace();
            } finally {
                try { ps.close();} catch (SQLException ignore) {}
            }
        } else {
            JOptionPane.showMessageDialog(null, "Location already added");
        }
    }
    
    public static void updateLocation (String location, String description, String filePath) {
        Conn = Database.DBConnection.connectDB();
        FileInputStream fs=null;
        PreparedStatement st = null;
        try {
            File f = new File(filePath);
            fs = new FileInputStream(f);
            String sql = "UPDATE locations_added SET image = ? WHERE location = ?";
            st = Conn.prepareStatement(sql);
            st.setString(2, location);
            st.setBinaryStream(1,fs,(int) f.length());
            st.executeUpdate();
            updateLocation(location, description);
            
        }   catch (SQLException ex) {
            System.out.println("SQL Error.");
            ex.printStackTrace();
        } catch (FileNotFoundException ex) {
            System.out.println("File Not Found");
            ex.printStackTrace();
        } finally {
	    try { st.close(); } catch (SQLException ignore) {} 
        }
    }
    
    public static void updateLocation (String location, String description) {
        Conn = Database.DBConnection.connectDB();
        PreparedStatement st = null;
        try {
            String sql = "UPDATE location_description SET description = ? WHERE location = ?";
            st = Conn.prepareStatement(sql);
            st.setString(2, location);
            st.setString(1, description);
            st.executeUpdate();
            
        } catch (SQLException ex) {
            System.out.println("SQL Error");
            ex.printStackTrace();
        } finally {
	    try { st.close(); } catch (SQLException ignore) {}
        }
    }
    public static void deleteLocation (String location) {
        Conn = Database.DBConnection.connectDB();
        PreparedStatement st = null;
        try {
            String sql = "DELETE FROM locations_added WHERE location = ?";
            st = Conn.prepareStatement(sql);
            st.setString(1, location);
            st.executeUpdate();
            
            sql = "DELETE FROM location_description WHERE location = ?";
            st = Conn.prepareStatement(sql);
            st.setString(1, location);
            st.executeUpdate();
        } catch (SQLException ex) {
            System.out.println("SQL Error");
            ex.printStackTrace();
        } finally {
	    try { st.close(); } catch (SQLException ignore) {}
        }
    }
}

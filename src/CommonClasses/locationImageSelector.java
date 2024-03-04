package CommonClasses;

import Database.DBConnection;
import java.awt.image.BufferedImage;
import java.sql.Connection;

public class locationImageSelector {
    public static Connection Conn;
    public static BufferedImage LocationImageSelector (String location) {
        createConn();
        location ls = Database.DBLocation.getLocationImage(location);
        return ls.img;
            
    }   
    
    public static void createConn () {
        Conn = DBConnection.connectDB();
    }
}

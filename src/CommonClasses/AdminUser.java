package CommonClasses;

import java.awt.image.BufferedImage;

/**
 *
 * @author Navo
 */
public class AdminUser {
    public int id;
    public String name;
    public BufferedImage profile_pic;
    public String pass;
    
    public AdminUser(int i, String n, BufferedImage img) {
        id = i;
        name = n;
        profile_pic = img;
    }
    public AdminUser(String n, BufferedImage img) {
        name = n;
        profile_pic = img;
    }
    public AdminUser(String n, BufferedImage img, String p) {
        name = n;
        profile_pic = img;
        pass = p;
    }
    public AdminUser (String n) {
        name = n;
    }
    public AdminUser (int i, String n) {
        id = i;
        name = n;
    }
    public AdminUser (int i, String n, String p) {
        id = i;
        name = n;
        pass = p;
    }
}

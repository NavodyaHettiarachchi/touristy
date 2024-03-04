package CommonClasses;

import java.awt.image.BufferedImage;

/**
 *
 * @author Navo
 */
public class location {
    public BufferedImage img;
    public String location;
    public String description;
    
    public location (String loc, BufferedImage img) {
        this.img = img;
        location = loc;
    }
    
    public location (String loc, BufferedImage img, String des) {
        this.img = img;
        description = des;
        location = loc;
    }
    
    public location (String loc) {
        location = loc;
    }
}

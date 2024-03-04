package CommonClasses;
import java.awt.image.BufferedImage;
public class CropImage {
    private BufferedImage image;
    
    public BufferedImage[] cropImage(String location){
        // getting the location image source
        locationImageSelector lis = new locationImageSelector();
        image = lis.LocationImageSelector(location);
        if (image != null) {

            double reqRatio = 800 / 600d;
            double imgRatio = (double) image.getWidth() / (double) image.getHeight();

            if (imgRatio != reqRatio) {
                if (imgRatio > reqRatio) {
                    double maxWidth = Math.floor(image.getHeight() * reqRatio);
                    image = CommonClasses.Scalr.crop(image, (image.getWidth() / 2) - ((int) maxWidth / 2), 0, (int) maxWidth, image.getHeight());
                    image = CommonClasses.Scalr.resize(image, 800, 600);
                } else {
                    double maxHeight = Math.floor(image.getWidth() * (600 / 800d));
                    System.out.println(maxHeight);
                    image = CommonClasses.Scalr.crop(image, 0, (image.getHeight() / 2) - ((int) maxHeight / 2), image.getWidth(), (int) maxHeight);
                    image = CommonClasses.Scalr.resize(image, 800, 600);
                }
            }

            int imgWidth = image.getWidth();
            int imgHeight = image.getHeight();
            System.out.println("width - " + imgWidth);
            System.out.println("height - " + imgHeight);

            BufferedImage []imgs;
            imgs = new BufferedImage[9];

            imgs[0] = image.getSubimage(0, 0, imgWidth / 3, imgHeight / 3);
            imgs[1] = image.getSubimage(imgWidth / 3, 0, imgWidth / 3, imgHeight / 3);
            imgs[2] = image.getSubimage((imgWidth / 3) * 2, 0, imgWidth / 3, imgHeight / 3);
            imgs[3] = image.getSubimage(0, imgHeight / 3, imgWidth / 3, imgHeight / 3);
            imgs[4] = image.getSubimage(imgWidth / 3, imgHeight / 3, imgWidth / 3, imgHeight / 3);
            imgs[5] = image.getSubimage((imgWidth / 3) * 2, imgHeight / 3, imgWidth / 3, imgHeight / 3);
            imgs[6] = image.getSubimage(0, (imgHeight / 3) * 2, imgWidth / 3, imgHeight / 3);
            imgs[7] = image.getSubimage(imgWidth / 3, (imgHeight / 3) * 2, imgWidth / 3, imgHeight / 3);
            imgs[8] = image.getSubimage((imgWidth / 3) * 2, (imgHeight / 3) * 2, imgWidth / 3, imgHeight / 3);

            return imgs;
              
        }
        return null;
    }
}

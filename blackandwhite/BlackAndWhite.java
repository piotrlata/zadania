package blackandwhite;

import javax.imageio.ImageIO;
import java.awt.color.ColorSpace;
import java.awt.image.BufferedImage;
import java.awt.image.ColorConvertOp;
import java.io.File;
import java.io.IOException;

public class BlackAndWhite {
    public static void main(String[] args) throws IOException {
        BufferedImage grayScale = ImageIO.read(new File("C:\\Users\\Piotr\\Desktop\\images.jpg"));
        ColorConvertOp op = new ColorConvertOp(ColorSpace.getInstance(ColorSpace.CS_GRAY), null);
        BufferedImage filter = op.filter(grayScale, grayScale);
        File output = new File("C:\\Users\\Piotr\\Desktop\\saved.jpg");
        ImageIO.write(filter, "jpg", output);
    }
}

package r03.r03_06;

import java.awt.Color;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;

import javax.imageio.ImageIO;

import java.util.Arrays;

public class ImageDemo
{
    public static void main(String[] args) throws IOException
    {
        BufferedImage italyFlag = ImageDemo.createImage(450, 300,
            (x, y) -> x < 150 ? Color.GREEN.darker() : x < 300 ? Color.WHITE : Color.RED);
        Path path = Paths.get("flag.png");
        ImageIO.write(italyFlag, "PNG", path.toFile());
        System.out.println("Obraz zapisany w " + path.toAbsolutePath());
        System.out.println(Arrays.toString(ImageIO.getReaderFormatNames()));
    }

    public static BufferedImage createImage(int width, int height, PixelFunction f)
    {
        BufferedImage image = new BufferedImage(width, height, BufferedImage.TYPE_INT_RGB);

        for (int x = 0; x < width; x++)
            for (int y = 0; y < height; y++) {
                Color color = f.apply(x, y);
                image.setRGB(x, y, color.getRGB());
            }
        return image;
    }

}

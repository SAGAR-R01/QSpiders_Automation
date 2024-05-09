import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

public class ImageToBinary {
    public static void main(String[] args) {
        try {
            // Read the image file
            BufferedImage image = ImageIO.read(new File("\"C:\\Users\\Lenovo-QSP\\OneDrive\\Pictures\\Screenshots\\Screenshot 2024-05-09 125834.png\""));

            // Get the dimensions of the image
            int width = image.getWidth();
            int height = image.getHeight();

            // Iterate through each pixel of the image
            for (int y = 0; y < height; y++) {
                for (int x = 0; x < width; x++) {
                    // Get the RGB color of the pixel
                    int rgb = image.getRGB(x, y);

                    // Extract the individual color components (red, green, blue)
                    int red = (rgb >> 16) & 0xFF;
                    int green = (rgb >> 8) & 0xFF;
                    int blue = rgb & 0xFF;

                    // Convert the color components to binary format
                    String binaryRed = Integer.toBinaryString(red);
                    String binaryGreen = Integer.toBinaryString(green);
                    String binaryBlue = Integer.toBinaryString(blue);

                    // Print the binary representation of the pixel color
                    System.out.println("Pixel at (" + x + ", " + y + "): " + binaryRed + " " + binaryGreen + " " + binaryBlue);
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

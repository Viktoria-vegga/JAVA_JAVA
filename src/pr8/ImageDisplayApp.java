package pr8;

import javax.swing.*;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import javax.imageio.ImageIO;

public class ImageDisplayApp extends JFrame {
    private JLabel imageLabel;

    public ImageDisplayApp(String imagePath) {
        setTitle("Image Display");
        setSize(800, 600);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        try {
            BufferedImage image = ImageIO.read(new File(imagePath));
            imageLabel = new JLabel(new ImageIcon(image));
            add(imageLabel, BorderLayout.CENTER);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            ImageDisplayApp app = new ImageDisplayApp("C:\\Users\\Виктория\\Рабочий стол\\Image.jpg");
            app.setVisible(true);
        });
    }
}


package pr8;

import javax.swing.*;
import java.awt.*;
import java.util.Random;

// Абстрактный класс Shape
abstract class Shape {
    private Color color;
    private int x;
    private int y;

    public Shape(Color color, int x, int y) {
        this.color = color;
        this.x = x;
        this.y = y;
    }

    public abstract void draw(Graphics g);

    public Color getColor() {
        return color;
    }

    int getX() { return x; }
    int getY() { return y; }
}

// Класс для прямоугольников
class Rectangle extends Shape {
    private int width;
    private int height;

    public Rectangle(Color color, int x, int y, int width, int height) {
        super(color, x, y);
        this.width = width;
        this.height = height;
    }

    @Override
    public void draw(Graphics g) {
        g.setColor(getColor());
        g.fillRect(getX(), getY(), width, height);
    }
}

// Класс для овалов
class Oval extends Shape {
    private int width;
    private int height;

    public Oval(Color color, int x, int y, int width, int height) {
        super(color, x, y);
        this.width = width;
        this.height = height;
    }

    @Override
    public void draw(Graphics g) {
        g.setColor(getColor());
        g.fillOval(getX(), getY(), width, height);
    }
}

public class RandomShapesApp extends JFrame {
    private final int WINDOW_WIDTH = 800;
    private final int WINDOW_HEIGHT = 600;

    public RandomShapesApp() {
        setTitle("Random Shapes");
        setSize(WINDOW_WIDTH, WINDOW_HEIGHT);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel panel = new JPanel() {
            @Override
            protected void paintComponent(Graphics g) {
                super.paintComponent(g);
                drawRandomShapes(g);
            }
        };

        add(panel);
    }

    private void drawRandomShapes(Graphics g) {
        Random random = new Random();

        for (int i = 0; i < 20; i++) {
            int x = random.nextInt(WINDOW_WIDTH);
            int y = random.nextInt(WINDOW_HEIGHT);
            int width = random.nextInt(100) + 20; // Ширина от 20 до 120
            int height = random.nextInt(100) + 20; // Высота от 20 до 120
            Color color = new Color(random.nextInt(256), random.nextInt(256), random.nextInt(256)); // Случайный цвет

            Shape shape;
            if (i % 2 == 0) {
                shape = new Rectangle(color, x, y, width, height);
            } else {
                shape = new Oval(color, x, y, width, height);
            }

            shape.draw(g);
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            RandomShapesApp app = new RandomShapesApp();
            app.setVisible(true);
        });
    }
}

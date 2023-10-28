package pr8;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.Timer;

public class AnimationApp extends JFrame {
    private JLabel animationLabel;
    private Timer timer;
    private int currentFrame = 0;
    private int totalFrames = 5; // Общее количество кадров

    public AnimationApp() {
        setTitle("Анимация");
        setSize(400, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        animationLabel = new JLabel();
        add(animationLabel, BorderLayout.CENTER);

        // Создаем таймер для анимации (каждые 100 миллисекунд)
        int delay = 1000;
        timer = new Timer(delay, new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                updateAnimation();
            }
        });
        timer.start();
    }

    private void updateAnimation() {
        // Загружаем следующий кадр
        String framePath = "C:\\Users\\Виктория\\IdeaProjects\\pr8\\src\\AnimationFrames\\" + (currentFrame+1) + ".jpg"; // Название кадра
        ImageIcon frameIcon = new ImageIcon(framePath);
        animationLabel.setIcon(frameIcon);

        // Увеличиваем текущий кадр и обновляем до начала, если достигнут последний кадр
        currentFrame++;
        if (currentFrame >= totalFrames) {
            currentFrame = 0;
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            AnimationApp app = new AnimationApp();
            app.setVisible(true);
        });
    }
}


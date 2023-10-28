package pr7;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class FootballMatchSimulator extends JFrame {
    private int milanScore = 0;
    private int madridScore = 0;
    private JLabel resultLabel;       // Метка для отображения счета
    private JLabel lastScorerLabel;  // Метка для отображения последнего забившего
    private JLabel winnerLabel;      // Метка для отображения победителя

    public FootballMatchSimulator() {
        setTitle("Football Match Simulator"); // Устанавливаем заголовок окна
        setSize(400, 200);                   // Устанавливаем размер окна
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // Закрытие окна завершит программу
        setLocationRelativeTo(null);          // Центрируем окно по центру экрана

        // Создаем компоненты GUI
        JButton milanButton = new JButton("AC Milan");   // Кнопка для команды Милан
        JButton madridButton = new JButton("Real Madrid"); // Кнопка для команды Мадрид
        resultLabel = new JLabel("Result: 0 X 0");        // Метка для отображения счета
        lastScorerLabel = new JLabel("Last Scorer: N/A"); // Метка для отображения последнего забившего
        winnerLabel = new JLabel("Winner: DRAW");         // Метка для отображения победителя

        // Добавляем обработчики событий для кнопок
        milanButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                milanScore++; // Увеличиваем счет для Милана
                updateLabels("AC Milan"); // Обновляем метки
            }
        });

        madridButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                madridScore++; // Увеличиваем счет для Мадрида
                updateLabels("Real Madrid"); // Обновляем метки
            }
        });

        // Создаем панель и добавляем компоненты
        JPanel panel = new JPanel(new GridLayout(3, 2)); // Создаем панель с сеточным расположением
        panel.add(milanButton);   // Добавляем кнопку Милана на панель
        panel.add(madridButton);  // Добавляем кнопку Мадрида на панель
        panel.add(resultLabel);   // Добавляем метку счета на панель
        panel.add(lastScorerLabel); // Добавляем метку последнего забившего на панель
        panel.add(winnerLabel);    // Добавляем метку победителя на панель

        // Добавляем панель к фрейму
        add(panel);

        setVisible(true); // Делаем окно видимым
    }

    // Метод для обновления меток счета, последнего забившего и победителя
    private void updateLabels(String lastScorer) {
        resultLabel.setText("Result: " + milanScore + " X " + madridScore); // Обновляем счет
        lastScorerLabel.setText("Last Scorer: " + lastScorer); // Обновляем последнего забившего

        // Определяем победителя
        if (milanScore > madridScore) {
            winnerLabel.setText("Winner: AC Milan");
        } else if (madridScore > milanScore) {
            winnerLabel.setText("Winner: Real Madrid");
        } else {
            winnerLabel.setText("Winner: DRAW");
        }
    }
}
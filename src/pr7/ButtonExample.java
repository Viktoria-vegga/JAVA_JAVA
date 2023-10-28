package pr7;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ButtonExample {
    public static void main(String[] args) {
        // Создаем главное окно приложения
        JFrame frame = new JFrame("Пример кнопки");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(300, 200);

        // Создаем кнопку
        JButton button = new JButton("Нажми меня");

        // Добавляем слушателя событий для кнопки
        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Этот код выполняется при нажатии кнопки
                JOptionPane.showMessageDialog(frame, "Кнопка была нажата!");
            }
        });

        // Добавляем кнопку на окно
        frame.add(button);

        // Отображаем окно
        frame.setVisible(true);
    }
}
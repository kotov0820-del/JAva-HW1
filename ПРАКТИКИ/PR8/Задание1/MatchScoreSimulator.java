package PR8.Задание1;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MatchScoreSimulator extends JFrame implements ActionListener {
    // Переменные для счета
    private int milanScore = 0;
    private int madridScore = 0;

    // GUI Компоненты (JLabel)
    private JLabel resultLabel = new JLabel("Result: 0 X 0", SwingConstants.CENTER); // [cite: 142]
    private JLabel scorerLabel = new JLabel("Last Scorer: N/A", SwingConstants.CENTER); // [cite: 142]
    private JLabel winnerLabel = new JLabel("Winner: DRAW", SwingConstants.CENTER); // [cite: 142]

    // GUI Компоненты (JButton)
    private JButton milanButton = new JButton("АС Milan"); // [cite: 140]
    private JButton madridButton = new JButton("Real Madrid"); // [cite: 141]

    public MatchScoreSimulator() {
        super("Football Match Scoreboard"); // Название окна

        // Настройка окна
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // [cite: 51]
        setSize(400, 200);

        // Создаем панель для организации компонентов (по умолчанию FlowLayout, что нам подходит) [cite: 92]
        JPanel panel = new JPanel(); // [cite: 101]
        panel.setLayout(new GridLayout(3, 2, 10, 10)); // Используем GridLayout для аккуратного расположения

        // Добавляем слушателей событий к кнопкам
        milanButton.addActionListener(this);
        madridButton.addActionListener(this);

        // Добавляем компоненты на панель
        panel.add(milanButton); // [cite: 140]
        panel.add(madridButton); // [cite: 141]

        // Размещаем метки, растягивая их на 2 колонки
        panel.add(resultLabel); // [cite: 142]
        panel.add(scorerLabel); // [cite: 142]
        panel.add(winnerLabel); // [cite: 142]

        // Добавляем панель к фрейму [cite: 112]
        add(panel, BorderLayout.CENTER);

        pack(); // Упаковываем компоненты [cite: 114]
        setVisible(true); // Делаем окно видимым [cite: 60]
    }

    // Метод, который вызывается при нажатии на кнопку
    @Override
    public void actionPerformed(ActionEvent e) {
        String lastScorer = "N/A";

        if (e.getSource() == milanButton) {
            milanScore++; // Увеличиваем счет Милана [cite: 143]
            lastScorer = "AC Milan"; // [cite: 144]
        } else if (e.getSource() == madridButton) {
            madridScore++; // Увеличиваем счет Мадрида [cite: 145]
            lastScorer = "Real Madrid";
        }

        // Обновляем метку счета
        resultLabel.setText("Result: " + milanScore + " X " + madridScore);

        // Обновляем метку последнего забившего
        scorerLabel.setText("Last Scorer: " + lastScorer);

        // Обновляем метку победителя
        updateWinnerLabel();
    }

    private void updateWinnerLabel() {
        String winner;
        if (milanScore > madridScore) {
            winner = "AC Milan";
        } else if (madridScore > milanScore) {
            winner = "Real Madrid";
        } else {
            winner = "DRAW"; // [cite: 142]
        }
        winnerLabel.setText("Winner: " + winner); // [cite: 146]
    }

    public static void main(String[] args) {
        // Запуск GUI в потоке диспетчеризации событий
        SwingUtilities.invokeLater(MatchScoreSimulator::new);
    }
}
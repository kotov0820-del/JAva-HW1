package PR10.Задание1;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

// Расширяем JFrame, чтобы сделать класс окном (как в Листинге 15.8)
class CalculatorExample extends JFrame {
    // Текстовые поля для ввода двух чисел
    private JTextField jta1 = new JTextField(10);
    private JTextField jta2 = new JTextField(10);

    // Кнопки для четырех операций
    private JButton addButton = new JButton("+");
    private JButton subButton = new JButton("-");
    private JButton mulButton = new JButton("*");
    private JButton divButton = new JButton("/");

    CalculatorExample() {
        super("Простой Калькулятор"); // Заголовок окна
        setLayout(new FlowLayout());  // Используем FlowLayout для простоты
        setSize(300, 200);

        // Добавляем компоненты в окно
        add(new JLabel("1-е число:"));
        add(jta1);
        add(new JLabel("2-е число:"));
        add(jta2);

        // Добавляем кнопки
        add(addButton);
        add(subButton);
        add(mulButton);
        add(divButton);

        // --- Добавление слушателей с помощью АНОНИМНЫХ КЛАССОВ (inner classes) ---

        // 1. Сложение (+)
        addButton.addActionListener(new ActionListener() { // Анонимный класс
            public void actionPerformed(ActionEvent ae) {
                calculate('+');
            }
        });

        // 2. Вычитание (-)
        subButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent ae) {
                calculate('-');
            }
        });

        // 3. Умножение (*)
        mulButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent ae) {
                calculate('*');
            }
        });

        // 4. Деление (/)
        divButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent ae) {
                calculate('/');
            }
        });

        // Настройка закрытия окна
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }

    /**
     * Основной метод для выполнения вычислений и обработки ошибок.
     */
    private void calculate(char operation) {
        try {
            // Преобразование текста из полей в числа (как в Листинге 15.8)
            double x1 = Double.parseDouble(jta1.getText().trim());
            double x2 = Double.parseDouble(jta2.getText().trim());
            double result = 0;

            // Выбор операции
            switch (operation) {
                case '+':
                    result = x1 + x2;
                    break;
                case '-':
                    result = x1 - x2;
                    break;
                case '*':
                    result = x1 * x2;
                    break;
                case '/':
                    // Проверка деления на ноль
                    if (x2 == 0) {
                        JOptionPane.showMessageDialog(null, "Ошибка: Деление на ноль!", "Ошибка", JOptionPane.ERROR_MESSAGE);
                        return;
                    }
                    result = x1 / x2;
                    break;
            }

            // Вывод результата (как в Листинге 15.8)
            JOptionPane.showMessageDialog(null,
                    "Результат (" + operation + ") = " + result,
                    "Успех",
                    JOptionPane.INFORMATION_MESSAGE);

        } catch (NumberFormatException e) {
            // Обработка ошибки, если введены не числа (как в Листинге 15.8)
            JOptionPane.showMessageDialog(null,
                    "Ошибка: Введите корректные числа!",
                    "Ошибка ввода",
                    JOptionPane.ERROR_MESSAGE);
        }
    }

    public static void main(String[] args) {
        new CalculatorExample();
    }
}
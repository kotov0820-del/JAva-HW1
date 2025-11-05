package PR10.Задание4;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

class AdvancedCalculator extends JFrame {
    // Поле для отображения ввода/результата
    private JTextField displayField = new JTextField("0", 20);

    // Внутреннее состояние калькулятора
    private String currentOperator = "";
    private double firstOperand = 0;
    private boolean startNewNumber = true; // Флаг, указывающий, нужно ли начать новый ввод

    // Кнопки калькулятора (порядок для GridLayout 4x4)
    private String[] buttonLabels = {
            "7", "8", "9", "/",
            "4", "5", "6", "*",
            "1", "2", "3", "-",
            "0", ".", "=", "+"
    };

    AdvancedCalculator() {
        super("Калькулятор");
        setSize(300, 350);
        setLayout(new BorderLayout()); // Дисплей сверху, кнопки снизу
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Настройка дисплея
        displayField.setEditable(false); // Запретить ввод с клавиатуры
        displayField.setHorizontalAlignment(JTextField.RIGHT);
        displayField.setFont(new Font("SansSerif", Font.BOLD, 24));
        add(displayField, BorderLayout.NORTH);

        // Панель для кнопок с GridLayout 4x4
        JPanel buttonPanel = new JPanel();
        buttonPanel.setLayout(new GridLayout(4, 4, 5, 5)); // 4 строки, 4 столбца, отступы 5x5

        // --- Создание и добавление кнопок с АНОНИМНЫМИ СЛУШАТЕЛЯМИ ---
        for (String label : buttonLabels) {
            JButton button = new JButton(label);
            button.setFont(new Font("SansSerif", Font.PLAIN, 18));

            // Анонимный класс ActionListener для каждой кнопки
            button.addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent e) {
                    handleButtonClick(label); // Вызываем основную логику
                }
            });

            buttonPanel.add(button);
        }

        add(buttonPanel, BorderLayout.CENTER);
        setVisible(true);
    }

    /**
     * Основной метод обработки нажатий кнопок калькулятора.
     */
    private void handleButtonClick(String command) {
        // 1. Обработка Цифр и Точки
        if (command.matches("[0-9]") || command.equals(".")) {
            if (startNewNumber) {
                // Если начинаем новое число, очищаем или ставим 0
                displayField.setText(command.equals(".") ? "0." : command);
                startNewNumber = false;
            } else if (command.equals(".")) {
                // Если точки еще нет, добавляем ее
                if (!displayField.getText().contains(".")) {
                    displayField.setText(displayField.getText() + ".");
                }
            } else {
                // Иначе просто добавляем цифру
                displayField.setText(displayField.getText() + command);
            }
        }
        // 2. Обработка Операций (+, -, *, /)
        else if (command.matches("[\\+\\-\\*\\/]")) {
            // Если уже была операция, сначала вычисляем результат
            if (!currentOperator.isEmpty() && !startNewNumber) {
                calculateResult();
            }

            // Сохраняем текущее число как первый операнд
            try {
                firstOperand = Double.parseDouble(displayField.getText());
            } catch (NumberFormatException ex) {
                firstOperand = 0; // На случай ошибки ввода
            }

            // Сохраняем новую операцию
            currentOperator = command;
            startNewNumber = true; // Следующее нажатие начнет новый ввод
        }
        // 3. Обработка Равно (=)
        else if (command.equals("=")) {
            if (!currentOperator.isEmpty()) {
                calculateResult();
                currentOperator = ""; // Сброс операции после вычисления
            }
        }
    }

    /**
     * Выполняет фактическое вычисление и обновляет дисплей.
     */
    private void calculateResult() {
        try {
            double secondOperand = Double.parseDouble(displayField.getText());
            double result = 0;

            switch (currentOperator) {
                case "+":
                    result = firstOperand + secondOperand;
                    break;
                case "-":
                    result = firstOperand - secondOperand;
                    break;
                case "*":
                    result = firstOperand * secondOperand;
                    break;
                case "/":
                    if (secondOperand == 0) {
                        displayField.setText("Ошибка!");
                        currentOperator = ""; // Сброс операции
                        startNewNumber = true;
                        return;
                    }
                    result = firstOperand / secondOperand;
                    break;
            }

            displayField.setText(String.valueOf(result));
            firstOperand = result; // Результат становится первым операндом для дальнейших вычислений
            startNewNumber = true;
        } catch (NumberFormatException e) {
            displayField.setText("Ошибка!");
            currentOperator = "";
            startNewNumber = true;
        }
    }

    public static void main(String[] args) {
        // Запуск приложения
        new AdvancedCalculator();
    }
}
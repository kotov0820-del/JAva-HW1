package PR10.Задание2;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

class ComboBoxExample extends JFrame {
    // Список стран
    String[] countries = {"Australia", "China", "England", "Russia", "Brazil"};

    // Создаем JComboBox с нашим списком стран
    private JComboBox<String> countryComboBox = new JComboBox<>(countries);

    ComboBoxExample() {
        super("Hello Swing"); // Заголовок окна (как на Рисунке 15.8)
        setLayout(new FlowLayout());
        setSize(300, 150);

        // Добавляем JComboBox в окно
        add(new JLabel("Выберите страну:"));
        add(countryComboBox);

        // --- Добавление слушателя с помощью АНОНИМНОГО КЛАССА ---

        // Добавляем ActionListener к ComboBox. 
        // Событие срабатывает при выборе нового элемента.
        countryComboBox.addActionListener(new ActionListener() {
            // Анонимный класс, реализующий метод actionPerformed()
            public void actionPerformed(ActionEvent e) {
                // Получаем выбранный элемент
                String selectedCountry = (String) countryComboBox.getSelectedItem();

                // Формируем информацию о стране
                String info;
                switch (selectedCountry) {
                    case "Australia":
                        info = "Австралия: Материк кенгуру и Большого Барьерного Рифа.";
                        break;
                    case "China":
                        info = "Китай: Страна Великой стены и множества инноваций.";
                        break;
                    case "England":
                        info = "Англия: Родина Шекспира и Биг-Бена.";
                        break;
                    case "Russia":
                        info = "Россия: Самая большая страна в мире, известная своей историей.";
                        break;
                    case "Brazil":
                        info = "Бразилия: Страна карнавала и футбола.";
                        break;
                    default:
                        info = "Информация о стране не найдена.";
                        break;
                }

                // Выводим информацию во всплывающем окне
                JOptionPane.showMessageDialog(
                        ComboBoxExample.this, // Родительский компонент
                        info,
                        "Информация о " + selectedCountry,
                        JOptionPane.INFORMATION_MESSAGE
                );
            }
        });

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }

    public static void main(String[] args) {
        // Установка внешнего вида (опционально, делает приложение более "современным")
        try {
            UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
        } catch (Exception e) {
            e.printStackTrace();
        }
        new ComboBoxExample();
    }
}
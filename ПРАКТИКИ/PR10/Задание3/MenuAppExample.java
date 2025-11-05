package PR10.Задание3;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

class MenuAppExample extends JFrame {

    // Текстовое поле внизу
    private JTextArea textArea = new JTextArea("Это область, куда можно вводить текст.", 10, 40);
    // Кнопки
    private JButton button1 = new JButton("Button 1");
    private JButton button2 = new JButton("Button 2");

    MenuAppExample() {
        super("Hello Swing"); // Заголовок окна (как на Рисунке 15.9)
        setSize(400, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // 1. Создание Меню
        JMenuBar menuBar = new JMenuBar();

        // Меню "Файл"
        JMenu fileMenu = new JMenu("Файл");
        JMenuItem saveItem = new JMenuItem("Сохранить");
        JMenuItem exitItem = new JMenuItem("Выйти");
        fileMenu.add(saveItem);
        fileMenu.addSeparator(); // Разделитель
        fileMenu.add(exitItem);

        // Меню "Правка"
        JMenu editMenu = new JMenu("Правка");
        JMenuItem copyItem = new JMenuItem("Копировать");
        JMenuItem cutItem = new JMenuItem("Вырезать");
        JMenuItem pasteItem = new JMenuItem("Вставить");
        editMenu.add(copyItem);
        editMenu.add(cutItem);
        editMenu.add(pasteItem);

        // Меню "Справка"
        JMenu helpMenu = new JMenu("Справка");

        // Добавление меню в MenuBar
        menuBar.add(fileMenu);
        menuBar.add(editMenu);
        menuBar.add(helpMenu);

        // Установка MenuBar для фрейма
        setJMenuBar(menuBar);

        // 2. Создание Панели с кнопками (для верхней/центральной части)
        JPanel buttonPanel = new JPanel();
        buttonPanel.setLayout(new FlowLayout(FlowLayout.CENTER, 30, 10)); // Центрирование и отступы
        buttonPanel.add(button1);
        buttonPanel.add(button2);

        // Добавление прокрутки для текстового поля (как в Замечании к Листингу 15.8)
        JScrollPane scrollPane = new JScrollPane(textArea);

        // 3. Компоновка (используем BorderLayout для разделения)
        Container contentPane = getContentPane();
        contentPane.setLayout(new BorderLayout());

        contentPane.add(buttonPanel, BorderLayout.NORTH); // Кнопки вверху
        contentPane.add(scrollPane, BorderLayout.CENTER); // Текст в центре

        // --- Добавление слушателей с помощью АНОНИМНЫХ КЛАССОВ ---

        // Обработка кнопки "Выйти"
        exitItem.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                // При нажатии "Выйти" завершаем работу приложения
                System.exit(0);
            }
        });

        // Общий обработчик для всех других пунктов меню и кнопок
        ActionListener generalListener = new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String command = e.getActionCommand();
                JOptionPane.showMessageDialog(MenuAppExample.this,
                        "Выбрано действие: " + command, "Событие",
                        JOptionPane.INFORMATION_MESSAGE);
            }
        };

        // Прикрепление общего слушателя
        saveItem.addActionListener(generalListener);
        copyItem.addActionListener(generalListener);
        cutItem.addActionListener(generalListener);
        pasteItem.addActionListener(generalListener);
        helpMenu.addActionListener(generalListener); // Можно добавить и для самого меню

        button1.addActionListener(generalListener);
        button2.addActionListener(generalListener);

        setVisible(true);
    }

    public static void main(String[] args) {
        new MenuAppExample();
    }
}
package PR8;

import javax.swing.*;
import java.awt.*;

public class ImageDisplayGUI extends JFrame {

    public ImageDisplayGUI(String imagePath) {
        // Устанавливаем заголовок окна
        super("Image Viewer: " + imagePath);

        // Устанавливаем реакцию окна на закрытие по умолчанию
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // --- 1. Попытка загрузить изображение ---
        ImageIcon imageIcon = new ImageIcon(imagePath);

        // --- 2. Проверка результата загрузки ---
        // getIconWidth() вернет -1, если загрузка не удалась (файл не найден/неверный формат)
        if (imageIcon.getIconWidth() == -1) {
            // Если ошибка, выводим сообщение
            JOptionPane.showMessageDialog(this,
                    "Ошибка: Не удалось загрузить изображение по пути: " + imagePath +
                            "\nУбедитесь, что файл существует и путь указан верно.",
                    "Ошибка Файла",
                    JOptionPane.ERROR_MESSAGE);
            // Добавляем метку с текстом ошибки
            add(new JLabel("Изображение не найдено.", SwingConstants.CENTER));
            setSize(400, 100);
        } else {
            // Если успешно: создаем метку (JLabel) с загруженной иконкой
            JLabel imageLabel = new JLabel(imageIcon);
            add(imageLabel, BorderLayout.CENTER);

            // pack() подгоняет размер окна под размер компонентов (в данном случае – картинки)
            pack();
        }

        setLocationRelativeTo(null); // Центрируем окно на экране
        setVisible(true); // Делаем окно видимым
    }

    public static void main(String[] args) {
        // --- 3. Чтение аргументов командной строки ---
        if (args.length == 0) {
            // Если аргументов нет, выводим предупреждение и завершаем работу
            JOptionPane.showMessageDialog(null,
                    "Пожалуйста, укажите полный путь к файлу изображения как аргумент командной строки.",
                    "Отсутствует Аргумент",
                    JOptionPane.WARNING_MESSAGE);
            return;
        }

        final String imagePath = args[0]; // Первый аргумент - это наш путь

        // Запуск GUI в потоке диспетчеризации событий (стандартная практика Swing)
        SwingUtilities.invokeLater(() -> new ImageDisplayGUI(imagePath));
    }
}
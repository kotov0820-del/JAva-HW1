package PR8;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;

public class FrameAnimationGUI extends JFrame implements ActionListener {


    private final String[] FRAME_PATHS = {
            "C:\\Users\\kotov\\Desktop\\cr.jpg",
            "C:\\Users\\kotov\\Desktop\\cr1.jpg",
            "C:\\Users\\kotov\\Desktop\\cr2.png",

    };

    private List<ImageIcon> frames = new ArrayList<>();
    private JLabel animationLabel;
    private Timer timer;
    private int currentFrame = 0;

    public FrameAnimationGUI() {
        super("Simple Frame Animation");

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // 1. Загрузка кадров
        loadFrames();

        // Проверка, есть ли кадры для анимации
        if (frames.isEmpty()) {
            JOptionPane.showMessageDialog(this,
                    "Error: No valid frames found. Check file paths!",
                    "Animation Error",
                    JOptionPane.ERROR_MESSAGE);
            // Создаем пустую метку и выходим
            add(new JLabel("No frames loaded.", SwingConstants.CENTER));
            setSize(400, 100);
        } else {
            // 2. Создание метки для отображения текущего кадра
            animationLabel = new JLabel(frames.get(0), SwingConstants.CENTER); // [cite: 151]
            add(animationLabel, BorderLayout.CENTER);

            // 3. Создание таймера для переключения кадров (например, каждые 150 мс)
            timer = new Timer(150, this); // [cite: 151]
            timer.start();

            pack(); // Устанавливаем размер окна по размеру первого кадра [cite: 114]
        }

        setLocationRelativeTo(null);
        setVisible(true); // [cite: 115]
    }

    // Метод для загрузки всех кадров [cite: 152]
    private void loadFrames() {
        for (String path : FRAME_PATHS) {
            // Используем getClass().getResource() для загрузки из jar или ресурсов проекта

            ImageIcon icon = new ImageIcon(path);

            if (icon.getIconWidth() != -1) {
                frames.add(icon);
            } else {
                System.err.println("Failed to load frame: " + path);
            }
        }
    }

    // Метод, который вызывается по таймеру
    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == timer) {
            currentFrame = (currentFrame + 1) % frames.size(); // Переход к следующему кадру (циклически)
            animationLabel.setIcon(frames.get(currentFrame)); // Отображение нового кадра
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(FrameAnimationGUI::new);
    }
}

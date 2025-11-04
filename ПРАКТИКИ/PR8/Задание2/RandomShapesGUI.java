package PR8.Задание2;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class RandomShapesGUI extends JFrame {
    private static final int NUM_SHAPES = 20; // 20 случайных фигур [cite: 148]
    private static final int FRAME_WIDTH = 600;
    private static final int FRAME_HEIGHT = 500;

    private List<Shape> shapes = new ArrayList<>();

    public RandomShapesGUI() {
        super("Random Shapes Drawing");

        // Настройка окна
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(FRAME_WIDTH, FRAME_HEIGHT);

        // Создаем и добавляем 20 случайных фигур
        Random random = new Random();
        for (int i = 0; i < NUM_SHAPES; i++) {
            int x = random.nextInt(FRAME_WIDTH - 50) + 25;
            int y = random.nextInt(FRAME_HEIGHT - 50) + 25;

            // Выбираем случайный тип фигуры
            if (random.nextBoolean()) {
                // Круг
                int radius = random.nextInt(30) + 10;
                shapes.add(new Circle(x, y, radius));
            } else {
                // Прямоугольник
                int width = random.nextInt(50) + 20;
                int height = random.nextInt(50) + 20;
                shapes.add(new Rectangle(x, y, width, height));
            }
        }

        // Создаем пользовательскую панель для рисования
        add(new DrawingPanel());

        setVisible(true);
    }

    // Внутренний класс для рисования
    private class DrawingPanel extends JPanel {
        @Override
        protected void paintComponent(Graphics g) {
            super.paintComponent(g);
            // Проходим по списку и рисуем каждую фигуру
            for (Shape shape : shapes) {
                shape.draw(g); // [cite: 148]
            }
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(RandomShapesGUI::new);
    }
}

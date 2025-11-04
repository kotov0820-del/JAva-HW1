package PR8.Задание2;

import java.awt.Color;
import java.awt.Graphics;
import java.util.Random;

// Абстрактный класс Shape [cite: 149]
public abstract class Shape {
    protected Color color; // Свойство фигуры: цвет [cite: 149]
    protected int x;       // Свойство фигуры: позиция X [cite: 149]
    protected int y;       // Свойство фигуры: позиция Y [cite: 149]
    protected static final Random RANDOM = new Random();

    public Shape(int x, int y) {
        this.x = x;
        this.y = y;
        // Случайный цвет [cite: 148]
        this.color = new Color(RANDOM.nextInt(256), RANDOM.nextInt(256), RANDOM.nextInt(256));
    }

    // Абстрактный метод для отрисовки
    public abstract void draw(Graphics g);
}
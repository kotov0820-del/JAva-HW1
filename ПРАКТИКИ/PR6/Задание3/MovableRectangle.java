package PR6.Задание3;

import PR6.Задание1.Movable;
import PR6.Задание2.MovablePoint;

// Класс MovableRectangle, реализующий Movable (Задание 1, 2)
public class MovableRectangle implements Movable {
    private MovablePoint topLeft;
    private MovablePoint bottomRight;

    // Параметризированный конструктор (Задание 3)
    public MovableRectangle(int x1, int y1, int x2, int y2, int xSpeed, int ySpeed) {
        // Создание точек с одинаковой скоростью
        topLeft = new MovablePoint(x1, y1, xSpeed, ySpeed);
        bottomRight = new MovablePoint(x2, y2, xSpeed, ySpeed);

        if (!topLeft.SpeedTest(bottomRight)) {
            // Эту проверку можно сделать и в конструкторе, хотя скорость принудительно одинакова
            System.err.println("Ошибка! Точки должны иметь одинаковую скорость.");
        }
    }

    // Методы интерфейса Movable
    @Override public void moveUp() { topLeft.moveUp(); bottomRight.moveUp(); }
    @Override public void moveDown() { topLeft.moveDown(); bottomRight.moveDown(); }
    @Override public void moveLeft() { topLeft.moveLeft(); bottomRight.moveLeft(); }
    @Override public void moveRight() { topLeft.moveRight(); bottomRight.moveRight(); }

    // toString() (Задание 3)
    @Override
    public String toString() {
        return "Rectangle:\n  TL=" + topLeft + "\n  BR=" + bottomRight;
    }

    // main для тестирования Заданий 1, 2, 3
    public static void main(String[] args) {
        System.out.println("--- Тест Заданий 1, 2, 3: MovableRectangle ---");

        MovableRectangle rect = new MovableRectangle(10, 10, 20, 20, 5, 5);
        System.out.println("1. Исходный: \n" + rect.toString());

        rect.moveRight();
        rect.moveUp();
        System.out.println("2. После moveRight, moveUp: \n" + rect.toString());

        // Дополнительный тест SpeedTest
        MovablePoint p1 = new MovablePoint(0, 0, 10, 10);
        MovablePoint p2 = new MovablePoint(0, 0, 5, 5);
        System.out.println("3. p1 и p2 имеют одинаковую скорость: " + p1.SpeedTest(p2));
    }
}
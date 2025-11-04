package PR6.Задание2;

import PR6.Задание1.Movable;

// Класс MovablePoint, реализующий Movable (Задание 2, 3)
public class MovablePoint implements Movable {
    private int x;
    private int y;
    private int xSpeed;
    private int ySpeed;

    // Параметризированный конструктор (Задание 3)
    public MovablePoint(int x, int y, int xSpeed, int ySpeed) {
        this.x = x;
        this.y = y;
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }

    // Методы интерфейса Movable
    @Override public void moveUp() { y -= ySpeed; }
    @Override public void moveDown() { y += ySpeed; }
    @Override public void moveLeft() { x -= xSpeed; }
    @Override public void moveRight() { x += xSpeed; }

    // toString() (Задание 3)
    @Override
    public String toString() {
        return "Point [x=" + x + ", y=" + y + ", xS=" + xSpeed + ", yS=" + ySpeed + "]";
    }

    // Логический метод SpeedTest() (Задание 3)
    public boolean SpeedTest(MovablePoint other) {
        return this.xSpeed == other.xSpeed && this.ySpeed == other.ySpeed;
    }
}
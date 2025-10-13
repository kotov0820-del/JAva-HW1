package PR5.Задание2;

import PR5.Задание1.Movable;
import PR5.Задание1.MovablePoint;

public class MovableRectangle implements Movable {
    private MovablePoint topLeft;
    private MovablePoint bottomRight;

    public MovableRectangle(int x1, int y1, int x2, int y2, int xSpeed, int ySpeed) {
        topLeft = new MovablePoint(x1, y1, xSpeed, ySpeed);
        bottomRight = new MovablePoint(x2, y2, xSpeed, ySpeed);
    }

    private boolean isSpeedSame() {
        return topLeft.xSpeed == bottomRight.xSpeed &&
                topLeft.ySpeed == bottomRight.ySpeed;
    }

    @Override
    public String toString() {
        return "Rectangle with points: TopLeft=[" + topLeft.toString() +
                "], BottomRight=[" + bottomRight.toString() + "]";
    }

    @Override
    public void moveUp() {
        if (isSpeedSame()) { topLeft.moveUp(); bottomRight.moveUp(); }
        else { System.err.println("Ошибка движения: Скорости углов не совпадают."); }
    }

    @Override
    public void moveDown() {
        if (isSpeedSame()) { topLeft.moveDown(); bottomRight.moveDown(); }
        else { System.err.println("Ошибка движения: Скорости углов не совпадают."); }
    }

    @Override
    public void moveLeft() {
        if (isSpeedSame()) { topLeft.moveLeft(); bottomRight.moveLeft(); }
        else { System.err.println("Ошибка движения: Скорости углов не совпадают."); }
    }

    @Override
    public void moveRight() {
        if (isSpeedSame()) { topLeft.moveRight(); bottomRight.moveRight(); }
        else { System.err.println("Ошибка движения: Скорости углов не совпадают."); }
    }

    public static void main(String[] args) {
        System.out.println("\n--- Задание 2: MovableRectangle (Тест) ---");
        MovableRectangle r1 = new MovableRectangle(0, 10, 100, 0, 1, 1);
        System.out.println("Старт R1: " + r1);
        r1.moveRight();
        r1.moveUp();
        System.out.println("После движения R1: " + r1);
    }
}
package PR5.Задание1;

public class MovableCircle implements Movable {
    private int radius;
    private MovablePoint center;

    public MovableCircle(int x, int y, int xSpeed, int ySpeed, int radius) {
        this.radius = radius;
        this.center = new MovablePoint(x, y, xSpeed, ySpeed);
    }

    @Override
    public String toString() {
        return "Circle with radius=" + radius + ", center at [" + center.toString() + "]";
    }

    @Override public void moveUp() { center.moveUp(); }
    @Override public void moveDown() { center.moveDown(); }
    @Override public void moveLeft() { center.moveLeft(); }
    @Override public void moveRight() { center.moveRight(); }

    public static void main(String[] args) {
        System.out.println("--- Задание 1: MovablePoint и MovableCircle (Тест) ---");

        MovablePoint p1 = new MovablePoint(0, 0, 5, 10);
        System.out.println("Старт P1: " + p1);
        p1.moveRight();
        p1.moveDown();
        System.out.println("После движения P1: " + p1);

        MovableCircle c1 = new MovableCircle(10, 10, 2, 3, 5);
        System.out.println("Старт C1: " + c1);
        c1.moveLeft();
        c1.moveUp();
        System.out.println("После движения C1: " + c1);
    }
}
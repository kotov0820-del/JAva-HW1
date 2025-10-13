package PR3.Задание2;
public class MovableCircle implements Movable {
    private int radius;
    private MovablePoint center; // Композиция: MovableCircle содержит MovablePoint

    public MovableCircle(int x, int y, int xSpeed, int ySpeed, int radius) {
        this.center = new MovablePoint(x, y, xSpeed, ySpeed);
        this.radius = radius;
    }

    @Override
    public String toString() {
        return "Circle with radius=" + radius + ", center at " + center.toString();
    }

    // Делегирование движений центральной точке
    @Override
    public void moveUp() { center.moveUp(); }
    @Override
    public void moveDown() { center.moveDown(); }
    @Override
    public void moveLeft() { center.moveLeft(); }
    @Override
    public void moveRight() { center.moveRight(); }
}

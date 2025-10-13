package PR5.Задание1;

public class MovablePoint implements Movable {
    public int x;
    public int y;
    public int xSpeed;
    public int ySpeed;

    public MovablePoint(int x, int y, int xSpeed, int ySpeed) {
        this.x = x;
        this.y = y;
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }

    @Override
    public String toString() {
        return "(" + x + "," + y + "),speed=(" + xSpeed + "," + ySpeed + ")";
    }

    @Override public void moveUp() { y -= ySpeed; }
    @Override public void moveDown() { y += ySpeed; }
    @Override public void moveLeft() { x -= xSpeed; }
    @Override public void moveRight() { x += xSpeed; }
}
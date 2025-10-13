package PR3.Задание2;
public class MovablePoint implements Movable {
    int x; // package-private
    int y; // package-private
    int xSpeed;
    int ySpeed;

    public MovablePoint(int x, int y, int xSpeed, int ySpeed) {
        this.x = x;
        this.y = y;
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }

    public int getXSpeed() { return xSpeed; }
    public int getYSpeed() { return ySpeed; }

    @Override
    public String toString() {
        return "Point at (" + x + "," + y + "), speed=(" + xSpeed + "," + ySpeed + ")";
    }

    @Override
    public void moveUp() { y -= ySpeed; }
    @Override
    public void moveDown() { y += ySpeed; }
    @Override
    public void moveLeft() { x -= xSpeed; }
    @Override
    public void moveRight() { x += xSpeed; }
}

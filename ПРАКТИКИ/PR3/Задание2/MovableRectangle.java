package PR3.Задание2;
public class MovableRectangle implements Movable {
    private MovablePoint topLeft;
    private MovablePoint bottomRight;

    public MovableRectangle(int x1, int y1, int x2, int y2, int xSpeed, int ySpeed) {
        topLeft = new MovablePoint(x1, y1, xSpeed, ySpeed);
        bottomRight = new MovablePoint(x2, y2, xSpeed, ySpeed);

        // Убедимся, что скорости одинаковые
        if (!checkSpeed()) {
            throw new IllegalArgumentException("Speeds of topLeft and bottomRight points must be the same.");
        }
    }

    // Метод для проверки, что обе точки имеют одинаковую скорость
    private boolean checkSpeed() {
        return topLeft.getXSpeed() == bottomRight.getXSpeed() &&
                topLeft.getYSpeed() == bottomRight.getYSpeed();
    }

    @Override
    public String toString() {
        return "MovableRectangle with topLeft=" + topLeft.toString() +
                ", bottomRight=" + bottomRight.toString();
    }

    // Реализация методов интерфейса Movable, делегируя их обеим точкам
    @Override
    public void moveUp() {
        topLeft.moveUp();
        bottomRight.moveUp();
    }

    @Override
    public void moveDown() {
        topLeft.moveDown();
        bottomRight.moveDown();
    }

    @Override
    public void moveLeft() {
        topLeft.moveLeft();
        bottomRight.moveLeft();
    }

    @Override
    public void moveRight() {
        topLeft.moveRight();
        bottomRight.moveRight();
    }
}
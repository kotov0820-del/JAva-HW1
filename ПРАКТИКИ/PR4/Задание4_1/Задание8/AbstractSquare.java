package PR4.Задание4_1.Задание8;
public class AbstractSquare extends AbstractRectangle {
    public AbstractSquare() {
        super();
    }

    public AbstractSquare(double side) {
        super(side, side);
    }

    public AbstractSquare(double side, String color, boolean filled) {
        super(side, side, color, filled);
    }

    public double getSide() {
        return getWidth(); // Сторона квадрата - это его ширина или длина
    }

    public void setSide(double side) {
        setWidth(side);
        setLength(side);
    }

    @Override
    public void setWidth(double side) {
        super.setWidth(side);
        super.setLength(side); // Гарантируем, что длина тоже меняется
    }

    @Override
    public void setLength(double side) {
        super.setWidth(side); // Гарантируем, что ширина тоже меняется
        super.setLength(side);
    }

    @Override
    public String toString() {
        return "A " + (isFilled() ? "" : "not ") + "filled " + getColor() + " square with side=" + getSide();
    }
}
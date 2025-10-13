package PR4.Задание4_1.Задание8;
public class AbstractRectangle extends AbstractShape {
    private double width;
    private double length;

    public AbstractRectangle() {
        super();
        this.width = 1.0;
        this.length = 1.0;
    }

    public AbstractRectangle(double width, double length) {
        super();
        this.width = width;
        this.length = length;
    }

    public AbstractRectangle(double width, double length, String color, boolean filled) {
        super(color, filled);
        this.width = width;
        this.length = length;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    @Override
    public double getArea() {
        return width * length;
    }

    @Override
    public double getPerimeter() {
        return 2 * (width + length);
    }

    @Override
    public String toString() {
        return "A " + (isFilled() ? "" : "not ") + "filled " + getColor() + " rectangle with width=" + width + " and length=" + length;
    }
}

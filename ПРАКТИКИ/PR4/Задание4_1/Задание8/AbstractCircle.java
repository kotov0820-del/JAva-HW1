package PR4.Задание4_1.Задание8;
public class AbstractCircle extends AbstractShape {
    private double radius;

    public AbstractCircle() {
        super();
        this.radius = 1.0;
    }

    public AbstractCircle(double radius) {
        super();
        this.radius = radius;
    }

    public AbstractCircle(double radius, String color, boolean filled) {
        super(color, filled);
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    @Override
    public double getArea() {
        return Math.PI * radius * radius;
    }

    @Override
    public double getPerimeter() {
        return 2 * Math.PI * radius;
    }

    @Override
    public String toString() {
        return "A " + (isFilled() ? "" : "not ") + "filled " + getColor() + " circle with radius=" + radius;
    }
}
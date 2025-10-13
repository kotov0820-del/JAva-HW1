package PR4.Задание4_1.Задание8;
// <<abstract>> Shape
public abstract class AbstractShape {
    protected String color;
    protected boolean filled;

    public AbstractShape() {
        this("unknown", false);
    }

    public AbstractShape(String color, boolean filled) {
        this.color = color;
        this.filled = filled;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public boolean isFilled() {
        return filled;
    }

    public void setFilled(boolean filled) {
        this.filled = filled;
    }

    // Два абстрактных метода getArea() и getPerimeter()
    public abstract double getArea();
    public abstract double getPerimeter();

    // Метод toString()
    @Override
    public String toString() {
        return "A " + (filled ? "" : "not ") + "filled " + color + " shape.";
    }
}
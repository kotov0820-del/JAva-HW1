package PR4.Задание4_1.Задание1;
public class Shape {
    private String color;
    private boolean filled;

    public Shape() {
        this.color = "unknown";
        this.filled = false;
    }

    public Shape(String color, boolean filled) {
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

    public String getType() {
        return "Shape";
    }

    public double getArea() {
        return 0.0; // Должен быть переопределен в подклассах
    }

    public double getPerimeter() {
        return 0.0; // Должен быть переопределен в подклассах
    }

    @Override
    public String toString() {
        return "A " + (filled ? "" : "not ") + "filled " + color + " " + getType();
    }
}
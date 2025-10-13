package PR3.Задание1;
public abstract class Shape { // Добавляем 'abstract'
    protected String color;
    protected boolean filled;

    public Shape() {
        this.color = "green";
        this.filled = true;
    }

    public Shape(String color, boolean filled) {
        this.color = color;
        this.filled = filled;
    }

    public String getColor() { return color; }
    public void setColor(String color) { this.color = color; }
    public boolean isFilled() { return filled; }
    public void setFilled(boolean filled) { this.filled = filled; }

    public abstract double getArea(); // Абстрактный метод
    public abstract double getPerimeter(); // Абстрактный метод

    @Override
    public String toString() {
        return "A Shape with color of " + color + " and " + (filled ? "filled" : "not filled");
    }
}

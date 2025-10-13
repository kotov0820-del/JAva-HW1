package PR4.Задание4_1.Задание9;
public class Table extends Furniture {
    private double width;
    private double height;
    private double length;

    public Table(String name, double price, String material, double width, double height, double length) {
        super(name, price, material);
        this.width = width;
        this.height = height;
        this.length = length;
    }

    public double getWidth() {
        return width;
    }

    public double getHeight() {
        return height;
    }

    public double getLength() {
        return length;
    }

    @Override
    public String getDescription() {
        return "Этот стол предназначен для работы или приема пищи. Размеры: " + width + "x" + length + "x" + height + "м.";
    }

    @Override
    public String toString() {
        return "Стол (" + super.toString() + ", Размеры: " + width + "x" + length + "x" + height + "м)";
    }
}
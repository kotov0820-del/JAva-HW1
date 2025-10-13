package PR5.Задание10;

public class Computer {
    private ComputerBrand brand;
    private double price;

    public Computer(ComputerBrand brand, double price) {
        this.brand = brand;
        this.price = price;
    }

    public ComputerBrand getBrand() {
        return brand;
    }

    @Override
    public String toString() {
        return String.format("%s (%.2f$)", brand, price);
    }
}
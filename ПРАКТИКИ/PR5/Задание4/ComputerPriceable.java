package PR5.Задание4;

public class ComputerPriceable implements Priceable {
    private double price;

    public ComputerPriceable(double price) {
        this.price = price;
    }

    @Override
    public double getPrice() {
        return price;
    }
}
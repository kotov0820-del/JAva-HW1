package PR5.Задание4;

public class BookPriceable implements Priceable {
    private double price;

    public BookPriceable(double price) { this.price = price; }

    @Override
    public double getPrice() { return price; }

    public static void main(String[] args) {
        System.out.println("\n--- Задание 4: Priceable (Тест) ---");
        Priceable[] items = {
                new ComputerPriceable(999.99),
                new BookPriceable(45.50)
        };

        for (Priceable item : items) {
            System.out.println("Цена объекта: $" + item.getPrice());
        }
    }
}
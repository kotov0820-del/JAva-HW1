package PR4.Задание4_1.Задание9;
public abstract class Furniture {
    private String name;
    private double price;
    private String material;

    public Furniture(String name, double price, String material) {
        this.name = name;
        this.price = price;
        this.material = material;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public String getMaterial() {
        return material;
    }

    // Абстрактный метод, который будет описывать назначение мебели
    public abstract String getDescription();

    // Неабстрактный метод, например, для демонстрации
    public void displayInfo() {
        System.out.println("Название: " + name + ", Материал: " + material + ", Цена: " + price + " руб.");
    }

    @Override
    public String toString() {
        return "Название: " + name + ", Цена: " + price + ", Материал: " + material;
    }
}
package PR4.Задание4_1.Задание9;
public class Sofa extends Furniture {
    private int numberOfSeats;
    private boolean convertible; // Раскладной ли диван

    public Sofa(String name, double price, String material, int numberOfSeats, boolean convertible) {
        super(name, price, material);
        this.numberOfSeats = numberOfSeats;
        this.convertible = convertible;
    }

    public int getNumberOfSeats() {
        return numberOfSeats;
    }

    public boolean isConvertible() {
        return convertible;
    }

    @Override
    public String getDescription() {
        return "Этот диван предназначен для отдыха и расслабления. Мест: " + numberOfSeats + ", Раскладной: " + (convertible ? "да" : "нет");
    }

    @Override
    public String toString() {
        return "Диван (" + super.toString() + ", Мест: " + numberOfSeats + ", Раскладной: " + (convertible ? "да" : "нет") + ")";
    }
}
package PR4.Задание4_1.Задание9;
public class Chair extends Furniture {
    private int numberOfLegs;
    private boolean hasBackrest;

    public Chair(String name, double price, String material, int numberOfLegs, boolean hasBackrest) {
        super(name, price, material);
        this.numberOfLegs = numberOfLegs;
        this.hasBackrest = hasBackrest;
    }

    public int getNumberOfLegs() {
        return numberOfLegs;
    }

    public boolean hasBackrest() {
        return hasBackrest;
    }

    @Override
    public String getDescription() {
        return "Этот стул предназначен для сидения. Ножек: " + numberOfLegs + ", Спинка: " + (hasBackrest ? "есть" : "нет");
    }

    @Override
    public String toString() {
        return "Стул (" + super.toString() + ", Ножки: " + numberOfLegs + ", Спинка: " + (hasBackrest ? "есть" : "нет") + ")";
    }
}
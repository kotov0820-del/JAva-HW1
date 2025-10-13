package PR5.Задание3;

public class Car implements Nameable {
    private String model;
    public Car(String model) { this.model = model; }
    @Override
    public String getName() { return "Машина: " + model; }

    public static void main(String[] args) {
        System.out.println("\n--- Задание 3: Nameable (Тест) ---");
        Nameable[] entities = {
                new Planet("Марс"),
                new Car("Lada Granta")
        };

        for (Nameable entity : entities) {
            System.out.println("Объект называется: " + entity.getName());
        }
    }
}
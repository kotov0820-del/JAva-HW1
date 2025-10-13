package PR4.Задание4_1.Задание10;
// TransportCalculator.java
public class TransportCalculator {
    public static void main(String[] args) {
        Car car = new Car("Легковой автомобиль", 100, 500, 4, 8, 1.2, 0.5);
        Plane plane = new Plane("Boeing 747", 900, 60000, 400, 8000, 2.5, 1000);
        Train train = new Train("Пассажирский поезд", 120, 10000, 600, 50, 1.0, 500);
        Ship ship = new Ship("Круизный лайнер", 30, 100000, 2000, 100, 0.8, 2000);

        double distance = 1000;
        int numPassengers = 100;
        double cargoWeight = 5000;

        System.out.println("--- Расчет для " + distance + " км ---");

        System.out.println("\n--- " + car.getName() + " ---");
        System.out.printf("Время в пути: %.2f часов%n", car.calculateTravelTime(distance));
        System.out.printf("Стоимость перевозки %d пассажиров: %.2f у.е.%n", 2, car.calculatePassengerCost(distance, 2));
        System.out.printf("Стоимость перевозки %.2f кг груза: %.2f у.е.%n", 200.0, car.calculateCargoCost(distance, 200));

        System.out.println("\n--- " + plane.getName() + " ---");
        System.out.printf("Время в пути: %.2f часов%n", plane.calculateTravelTime(distance));
        System.out.printf("Стоимость перевозки %d пассажиров: %.2f у.е.%n", numPassengers, plane.calculatePassengerCost(distance, numPassengers));
        System.out.printf("Стоимость перевозки %.2f кг груза: %.2f у.е.%n", cargoWeight, plane.calculateCargoCost(distance, cargoWeight));

        System.out.println("\n--- " + train.getName() + " ---");
        System.out.printf("Время в пути: %.2f часов%n", train.calculateTravelTime(distance));
        System.out.printf("Стоимость перевозки %d пассажиров: %.2f у.е.%n", numPassengers, train.calculatePassengerCost(distance, numPassengers));
        System.out.printf("Стоимость перевозки %.2f кг груза: %.2f у.е.%n", cargoWeight, train.calculateCargoCost(distance, cargoWeight));

        System.out.println("\n--- " + ship.getName() + " ---");
        System.out.printf("Время в пути: %.2f часов%n", ship.calculateTravelTime(distance));
        System.out.printf("Стоимость перевозки %d пассажиров: %.2f у.е.%n", numPassengers, ship.calculatePassengerCost(distance, numPassengers));
        System.out.printf("Стоимость перевозки %.2f кг груза: %.2f у.е.%n", cargoWeight, ship.calculateCargoCost(distance, cargoWeight));
    }
}
package PR4.Задание4_1.Задание10;
// Car.java
public class Car extends TransportVehicle {
    private double comfortFactor;

    public Car(String name, double speed, double cargoCapacity, double passengerCapacity,
               double fuelConsumption, double fuelCostPerLiter, double comfortFactor) {
        super(name, speed, cargoCapacity, passengerCapacity, fuelConsumption, fuelCostPerLiter);
        this.comfortFactor = comfortFactor;
    }

    @Override
    public double calculateTravelTime(double distance) {
        return distance / getSpeed();
    }

    @Override
    public double calculatePassengerCost(double distance, int passengers) {
        if (passengers > getPassengerCapacity()) {
            System.out.println("Warning: Too many passengers for " + getName());
            return -1;
        }
        return calculateFuelCostForDistance(distance) + (passengers * distance * comfortFactor * 0.01);
    }

    @Override
    public double calculateCargoCost(double distance, double cargoWeight) {
        if (cargoWeight > getCargoCapacity()) {
            System.out.println("Warning: Cargo weight exceeds capacity for " + getName());
            return -1;
        }
        return calculateFuelCostForDistance(distance) + (cargoWeight * distance * 0.005);
    }
}
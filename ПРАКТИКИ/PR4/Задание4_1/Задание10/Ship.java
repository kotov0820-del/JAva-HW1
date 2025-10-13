package PR4.Задание4_1.Задание10;
// Ship.java
public class Ship extends TransportVehicle {
    private double portFees;

    public Ship(String name, double speed, double cargoCapacity, double passengerCapacity,
                double fuelConsumption, double fuelCostPerLiter, double portFees) {
        super(name, speed, cargoCapacity, passengerCapacity, fuelConsumption, fuelCostPerLiter);
        this.portFees = portFees;
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
        return calculateFuelCostForDistance(distance) + portFees + (passengers * distance * 0.03);
    }

    @Override
    public double calculateCargoCost(double distance, double cargoWeight) {
        if (cargoWeight > getCargoCapacity()) {
            System.out.println("Warning: Cargo weight exceeds capacity for " + getName());
            return -1;
        }
        return calculateFuelCostForDistance(distance) + portFees + (cargoWeight * distance * 0.008);
    }
}
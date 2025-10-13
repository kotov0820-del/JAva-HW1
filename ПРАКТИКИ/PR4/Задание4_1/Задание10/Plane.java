package PR4.Задание4_1.Задание10;
// Plane.java
public class Plane extends TransportVehicle {
    private double airTrafficControlFee;

    public Plane(String name, double speed, double cargoCapacity, double passengerCapacity,
                 double fuelConsumption, double fuelCostPerLiter, double airTrafficControlFee) {
        super(name, speed, cargoCapacity, passengerCapacity, fuelConsumption, fuelCostPerLiter);
        this.airTrafficControlFee = airTrafficControlFee;
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
        double time = calculateTravelTime(distance);
        return calculateFuelCostForTime(time) + airTrafficControlFee + (passengers * distance * 0.1);
    }

    @Override
    public double calculateCargoCost(double distance, double cargoWeight) {
        if (cargoWeight > getCargoCapacity()) {
            System.out.println("Warning: Cargo weight exceeds capacity for " + getName());
            return -1;
        }
        double time = calculateTravelTime(distance);
        return calculateFuelCostForTime(time) + airTrafficControlFee + (cargoWeight * distance * 0.02);
    }
}
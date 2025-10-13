package PR4.Задание4_1.Задание10;
// Train.java
public class Train extends TransportVehicle {
    private double trackUsageFee;

    public Train(String name, double speed, double cargoCapacity, double passengerCapacity,
                 double fuelConsumption, double fuelCostPerLiter, double trackUsageFee) {
        super(name, speed, cargoCapacity, passengerCapacity, fuelConsumption, fuelCostPerLiter);
        this.trackUsageFee = trackUsageFee;
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
        return calculateFuelCostForDistance(distance) + trackUsageFee + (passengers * distance * 0.05);
    }

    @Override
    public double calculateCargoCost(double distance, double cargoWeight) {
        if (cargoWeight > getCargoCapacity()) {
            System.out.println("Warning: Cargo weight exceeds capacity for " + getName());
            return -1;
        }
        return calculateFuelCostForDistance(distance) + trackUsageFee + (cargoWeight * distance * 0.01);
    }
}
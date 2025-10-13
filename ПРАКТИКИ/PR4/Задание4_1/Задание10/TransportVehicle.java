package PR4.Задание4_1.Задание10;
// TransportVehicle.java
public abstract class TransportVehicle {
    private String name;
    private double speed; // km/h
    private double cargoCapacity; // kg
    private double passengerCapacity; // number of passengers
    private double fuelConsumption; // liters per 100 km (for land/sea) or per hour (for air)
    private double fuelCostPerLiter; // cost of fuel per liter

    public TransportVehicle(String name, double speed, double cargoCapacity,
                            double passengerCapacity, double fuelConsumption, double fuelCostPerLiter) {
        this.name = name;
        this.speed = speed;
        this.cargoCapacity = cargoCapacity;
        this.passengerCapacity = passengerCapacity;
        this.fuelConsumption = fuelConsumption;
        this.fuelCostPerLiter = fuelCostPerLiter;
    }

    public String getName() {
        return name;
    }

    public double getSpeed() {
        return speed;
    }

    public double getCargoCapacity() {
        return cargoCapacity;
    }

    public double getPassengerCapacity() {
        return passengerCapacity;
    }

    public abstract double calculateTravelTime(double distance);
    public abstract double calculatePassengerCost(double distance, int passengers);
    public abstract double calculateCargoCost(double distance, double cargoWeight);

    protected double calculateFuelCostForDistance(double distance) {
        return (distance / 100) * fuelConsumption * fuelCostPerLiter;
    }

    protected double calculateFuelCostForTime(double timeInHours) {
        return timeInHours * fuelConsumption * fuelCostPerLiter;
    }

    @Override
    public String toString() {
        return "TransportVehicle{" +
                "name='" + name + '\'' +
                ", speed=" + speed +
                ", cargoCapacity=" + cargoCapacity +
                ", passengerCapacity=" + passengerCapacity +
                ", fuelConsumption=" + fuelConsumption +
                ", fuelCostPerLiter=" + fuelCostPerLiter +
                '}';
    }
}
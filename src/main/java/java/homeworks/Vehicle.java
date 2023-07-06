package java.homeworks;

public class Vehicle {
    private final static double DEFAULT_FUEL_CONSUMPTION = 1.25;

    public double getFuelConsumption() {
        return fuelConsumption;
    }

    public void setFuelConsumption(double fuelConsumption) {
        this.fuelConsumption = fuelConsumption;
    }

    public double getFuel() {
        return fuel;
    }

    public void setFuel(double fuel) {
        this.fuel = fuel;
    }

    public int getHorsePower() {
        return horsePower;
    }

    public void setHorsePower(int horsePower) {
        this.horsePower = horsePower;
    }

    private double fuelConsumption;
    private double fuel;

    public Vehicle(double fuel, int horsePower, double fuelConsumption) {
        this.fuel = fuel;
        this.horsePower = horsePower;
        this.fuelConsumption = fuelConsumption;
    }

    private int horsePower;
    private void drive(double kilometers) {
        if (kilometers/fuelConsumption > 10) {
            System.out.println("Not enough fuel!");
        }
        else {
            System.out.println("driving...");
            fuel = fuelConsumption*kilometers;
            System.out.println(fuel + " fuel left.");
        }
    }
}

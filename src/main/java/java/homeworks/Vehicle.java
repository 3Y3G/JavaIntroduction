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
        double maxKilometers = (getFuel() / getFuelConsumption() * 100);
        double fuelLeft = getFuel() - (kilometers * getFuelConsumption() /100);

        if (maxKilometers < kilometers) {
            System.out.println("You can drive max " + maxKilometers + " kilometers with " + getFuel() + " fuel.");
        }
        else {
            System.out.println("Ypu will have " + fuelLeft + " fuel left after you drive " + kilometers + " kilometers.");
        }
    }
}

package java.homeworks;

public class SportCar extends Vehicle{
    private final static double DEFAULT_FUEL_CONSUMPTION = 10;

    public SportCar(double fuel, int horsePower) {
        super(fuel, horsePower, DEFAULT_FUEL_CONSUMPTION);
    }
}

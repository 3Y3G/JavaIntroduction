package exercises.homeworks;

public class RaceMotorcycle extends Vehicle{
    private final static double DEFAULT_FUEL_CONSUMPTION = 8;

    public RaceMotorcycle(double fuel, int horsePower) {
        super(fuel, horsePower, DEFAULT_FUEL_CONSUMPTION);
    }
}

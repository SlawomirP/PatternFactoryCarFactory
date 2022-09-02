package CarsFactory.Car;

public abstract class Car {
    private int engineCapacity;
    private String fuelType;
    private int yearOfProduction;
    private SteringWheelSide sideOfSteeringWheel;

     Car(int engineCapacity, String fuelType, int yearOfProduction, SteringWheelSide sideOfSteeringWheel) {
        this.engineCapacity = engineCapacity;
        this.fuelType = fuelType;
        this.yearOfProduction = yearOfProduction;
        this.sideOfSteeringWheel = sideOfSteeringWheel;
    }

    @Override
    public String toString() {
        return "{" +
                "engineCapacity=" + engineCapacity +
                ", fuelType='" + fuelType + '\'' +
                ", yearOfProduction=" + yearOfProduction +
                '}';
    }
}

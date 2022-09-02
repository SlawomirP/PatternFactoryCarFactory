package CarsFactory.Car;

public abstract class Car {
    private int engineCapacity;
    private String fuelType;
    private int yearOfProduction;

    protected Car(int engineCapacity, String fuelType, int yearOfProduction) {
        this.engineCapacity = engineCapacity;
        this.fuelType = fuelType;
        this.yearOfProduction = yearOfProduction;
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

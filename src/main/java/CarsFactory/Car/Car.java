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

    public int getEngineCapacity() {
        return engineCapacity;
    }

    public String getFuelType() {
        return fuelType;
    }

    public int getYearOfProduction() {
        return yearOfProduction;
    }

    @Override
    public String toString() {
        return "CarsFactory.Car{" +
                "engineCapacity=" + engineCapacity +
                ", fuelType='" + fuelType + '\'' +
                ", yearOfProduction=" + yearOfProduction +
                '}';
    }
}

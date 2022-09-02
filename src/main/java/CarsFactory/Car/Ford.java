package CarsFactory.Car;

public class Ford extends Car {
    public Ford(int engineCapacity, String fuelType, int yearOfProduction, SteringWheelSide sideOfSteeringWheel) {
        super(engineCapacity, fuelType, yearOfProduction, sideOfSteeringWheel);
    }

    public String toString(){
        return "Ford: " + super.toString();
    }
}

package CarsFactory.Car;

public class BMW extends Car {


    public BMW(int engineCapacity, String fuelType, int yearOfProduction, SteringWheelSide sideOfSteeringWheel) {
        super(engineCapacity, fuelType, yearOfProduction, sideOfSteeringWheel);
    }

    @Override
    public String toString(){
        return "BMW: " + super.toString();
    }
}

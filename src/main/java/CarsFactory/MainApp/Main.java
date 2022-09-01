package CarsFactory.MainApp;


import CarsFactory.Car.BMWModel;
import CarsFactory.Car.Car;
import CarsFactory.Factories.BMWFactory;

public class Main {
    public static void main(String[] args) {
        BMWFactory bmwFactory = new BMWFactory();
        Car bmw = bmwFactory.createBMW(BMWModel.E60);
        System.out.println(bmw);
    }
}

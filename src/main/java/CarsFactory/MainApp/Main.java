package CarsFactory.MainApp;


import CarsFactory.Car.BMWModel;
import CarsFactory.Car.Car;
import CarsFactory.Car.FordModels;
import CarsFactory.Factories.GeneralFactory;
import CarsFactory.Factories.LeftSideCarFactory;
import CarsFactory.Factories.RightSideCarFactory;

public class Main {
    public static void main(String[] args) {

        GeneralFactory left = new LeftSideCarFactory();
        GeneralFactory right = new RightSideCarFactory();

        Car bmw = left.createBMW(BMWModel.E60);
        Car ford = right.createFord(FordModels.CMAX);

        System.out.println(bmw);

        System.out.println(ford);
    }
}

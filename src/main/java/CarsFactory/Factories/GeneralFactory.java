package CarsFactory.Factories;

import CarsFactory.Car.BMWModel;
import CarsFactory.Car.Car;
import CarsFactory.Car.FordModels;

public interface GeneralFactory {

    Car createBMW(BMWModel bmwModel);
    Car createFord(FordModels fordModels);
}

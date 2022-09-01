package CarsFactory.Factories;


import CarsFactory.Car.BMW;
import CarsFactory.Car.Car;
import CarsFactory.Car.FordModels;

public class FordFactory {
    public Car createFord(FordModels fordModels){
        switch(fordModels){
            case CMAX:
                return new BMW(3, "hydrogen", 2021);
            case FOCUS:
                return new BMW(4,"diesel", 2022);
            default:
                throw new UnsupportedOperationException("not this type");
        }
    }
}

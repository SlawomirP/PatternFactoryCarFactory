package CarsFactory.Factories;


import CarsFactory.Car.BMW;
import CarsFactory.Car.BMWModel;
import CarsFactory.Car.Car;

public class BMWFactory {
    public Car createBMW(BMWModel bmwModel){
        switch(bmwModel){
            case X5:
                return new BMW(1, "gas", 1995);
            case E60:
                return new BMW(2,"petrol", 2000);
            default:
                throw new UnsupportedOperationException("not this type");
        }
    }

}

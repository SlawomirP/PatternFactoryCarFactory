package CarsFactory.Factories;

import CarsFactory.Car.BMW;
import CarsFactory.Car.BMWModel;
import CarsFactory.Car.Car;
import CarsFactory.Car.Ford;
import CarsFactory.Car.FordModels;
import CarsFactory.Car.SteringWheelSide;

import static CarsFactory.Car.BMWModel.E60;
import static CarsFactory.Car.BMWModel.X5;
import static CarsFactory.Car.FordModels.CMAX;

public class LeftSideCarFactory implements GeneralFactory{

    SteringWheelSide steringWheelSide = SteringWheelSide.LEFT;

    @Override
    public Car createBMW(BMWModel bmwModel) {
        switch(bmwModel){
            case X5:
                return new BMW(1, "gas", 1995, steringWheelSide);
            case E60:
                return new BMW(2,"petrol", 2000, steringWheelSide);
            default:
                throw new UnsupportedOperationException("not this type");
        }
    }

    @Override
    public Car createFord(FordModels fordModels) {
        switch(fordModels){
            case CMAX:
                return new Ford(3, "hydrogen", 2021, steringWheelSide);
            case FOCUS:
                return new Ford(4,"diesel", 2022, steringWheelSide);
            default:
                throw new UnsupportedOperationException("not this type");
        }
    }

    public String toString() {
        return "LEFT";
    }
}

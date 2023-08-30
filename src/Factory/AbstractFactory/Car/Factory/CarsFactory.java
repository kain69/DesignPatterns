package Factory.AbstractFactory.Car.Factory;

import Factory.AbstractFactory.Car.Pickup.Pickup;
import Factory.AbstractFactory.Car.Suv.Suv;

public interface CarsFactory {
    Suv createSuv();
    Pickup createPickup();
}

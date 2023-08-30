package Factory.AbstractFactory.Car.Factory;

import Factory.AbstractFactory.Car.Pickup.Pickup;
import Factory.AbstractFactory.Car.Pickup.PickupImpl.FordPickup;
import Factory.AbstractFactory.Car.Suv.Suv;
import Factory.AbstractFactory.Car.Suv.SuvImpl.FordSuv;

public class FordFactory implements CarsFactory{
    @Override
    public Suv createSuv() {
        return new FordSuv();
    }

    @Override
    public Pickup createPickup() {
        return new FordPickup();
    }
}

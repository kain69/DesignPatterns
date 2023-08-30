package Factory.AbstractFactory.Car.Factory;

import Factory.AbstractFactory.Car.Pickup.Pickup;
import Factory.AbstractFactory.Car.Pickup.PickupImpl.DodgePickup;
import Factory.AbstractFactory.Car.Suv.Suv;
import Factory.AbstractFactory.Car.Suv.SuvImpl.DodgeSuv;

public class DodgeFactory implements CarsFactory{
    @Override
    public Suv createSuv() {
        return new DodgeSuv();
    }

    @Override
    public Pickup createPickup() {
        return new DodgePickup();
    }
}

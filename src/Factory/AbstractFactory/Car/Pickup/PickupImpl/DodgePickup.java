package Factory.AbstractFactory.Car.Pickup.PickupImpl;

import Factory.AbstractFactory.Car.Pickup.Pickup;

public class DodgePickup implements Pickup {
    @Override
    public void description() {
        System.out.println("Dodge Pickup");
    }
}

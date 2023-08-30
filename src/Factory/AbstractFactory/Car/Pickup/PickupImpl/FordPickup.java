package Factory.AbstractFactory.Car.Pickup.PickupImpl;

import Factory.AbstractFactory.Car.Pickup.Pickup;

public class FordPickup implements Pickup {
    @Override
    public void description() {
        System.out.println("Ford Pickup");
    }
}

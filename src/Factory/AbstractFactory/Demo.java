
package Factory.AbstractFactory;

import Factory.AbstractFactory.Car.Factory.CarsFactory;
import Factory.AbstractFactory.Car.Factory.DodgeFactory;
import Factory.AbstractFactory.Car.Pickup.Pickup;

public class Demo {
    public static void main(String[] args) {
        CarsFactory carsFactory = new DodgeFactory();
        Pickup pickup = carsFactory.createPickup();
        pickup.description();
    }
}
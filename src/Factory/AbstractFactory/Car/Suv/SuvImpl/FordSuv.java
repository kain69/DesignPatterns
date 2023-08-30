package Factory.AbstractFactory.Car.Suv.SuvImpl;

import Factory.AbstractFactory.Car.Suv.Suv;

public class FordSuv implements Suv {
    @Override
    public void description() {
        System.out.println("Ford SUV");
    }
}

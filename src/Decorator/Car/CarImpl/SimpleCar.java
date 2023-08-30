package Decorator.Car.CarImpl;

import Decorator.Car.Car;

public class SimpleCar implements Car {

    private int speed = 100;

    @Override
    public int getSpeed() {
        return speed;
    }
}

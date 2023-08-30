package Decorator.Car.CarImpl;

import Decorator.Car.Car;

public class SportCar implements Car {

    private final Car car;

    public SportCar(Car car) {
        this.car = car;
    }


    @Override
    public int getSpeed() {
        return this.car.getSpeed() + 50;
    }
}

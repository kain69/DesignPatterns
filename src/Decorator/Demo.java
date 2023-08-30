package Decorator;

import Decorator.Car.Car;
import Decorator.Car.CarImpl.SimpleCar;
import Decorator.Car.CarImpl.SportCar;

public class Demo {
    public static void main(String[] args) {
        Car simpleCar = new SimpleCar();
        System.out.println("Simple car speed: " + simpleCar.getSpeed());

        Car sportCar = new SportCar(simpleCar);
        System.out.println("Sport car speed: " + sportCar.getSpeed());

    }
}
package Facade.Shape.ShapeImpl;

import Facade.Shape.Shape;

public class Triangle implements Shape {
    @Override
    public void draw() {
        System.out.println("Drawing triangle...");
    }
}

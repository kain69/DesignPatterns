package Facade.Shape.ShapeImpl;

import Facade.Shape.Shape;

public class Circle implements Shape {
    @Override
    public void draw() {
        System.out.println("Drawing circle...");
    }
}

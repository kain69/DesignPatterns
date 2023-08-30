package Bridge.Shape.ShapeImpl;

import Bridge.Color.Color;
import Bridge.Shape.Shape;

public class Circle extends Shape {
    public Circle(Color color) {
        super(color);
    }

    @Override
    public void draw() {
        System.out.println("Drawing circle");
        color.fillColor();
    }
}

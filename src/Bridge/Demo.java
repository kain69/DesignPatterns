package Bridge;

import Bridge.Color.Color;
import Bridge.Color.ColorImpl.Blue;
import Bridge.Color.ColorImpl.Green;
import Bridge.Color.ColorImpl.Red;
import Bridge.Shape.Shape;
import Bridge.Shape.ShapeImpl.Circle;
import Bridge.Shape.ShapeImpl.Rectangle;

public class Demo {
    public static void main(String[] args) {
        Color colorRed = new Red();
        Color colorGreen = new Green();
        Color colorBlue = new Blue();

        Shape rectangle = new Rectangle(colorRed);
        Shape circle1 = new Circle(colorBlue);
        Shape circle2 = new Circle(colorGreen);

        rectangle.draw();
        circle1.draw();
        circle2.draw();
    }
}
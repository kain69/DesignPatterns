package Facade.Shape;

import Facade.Shape.ShapeImpl.Circle;
import Facade.Shape.ShapeImpl.Rectangle;
import Facade.Shape.ShapeImpl.Triangle;

public class ShapeFacade {
    private final Shape circle;
    private final Shape rectangle;
    private final Shape triangle;

    public ShapeFacade() {
        this.circle = new Circle();
        this.rectangle = new Rectangle();
        this.triangle = new Triangle();
    }

    public void draw(String shape) {
        switch (shape) {
            case "circle" -> circle.draw();
            case "rectangle" -> rectangle.draw();
            case "triangle" -> triangle.draw();
            default -> System.out.println("Unknown shape");
        }
    }
}

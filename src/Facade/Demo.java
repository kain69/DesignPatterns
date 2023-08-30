package Facade;

import Facade.Shape.ShapeFacade;

public class Demo {
    public static void main(String[] args) {
        ShapeFacade shapeFacade = new ShapeFacade();
        shapeFacade.draw("circle");
    }
}
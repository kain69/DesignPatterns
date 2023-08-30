package Adapter.Square;

public class SquarePeg {

    private final double side;

    public SquarePeg(double side) {
        this.side = side;
    }

    public double getSide() {
        return side;
    }

    public double getArea() {
        return Math.pow(side,2);
    }
}

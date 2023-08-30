package Adapter.Square;

import Adapter.Round.Roundable;

public class SquarePegAdapter
        extends SquarePeg
        implements Roundable {
    public SquarePegAdapter(double side) {
        super(side);
    }

    @Override
    public double getRadius() {
        // радиус описанной окружности
        return getSide() * Math.sqrt(2)/2;
    }
}

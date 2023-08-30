package Adapter.Square.adapters;

import Adapter.Round.Roundable;
import Adapter.Square.SquarePeg;

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

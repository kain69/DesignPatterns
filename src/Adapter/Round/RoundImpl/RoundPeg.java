package Adapter.Round.RoundImpl;

import Adapter.Round.Roundable;

public class RoundPeg implements Roundable {

    private final double radius;

    public RoundPeg(double radius) {
        this.radius = radius;
    }

    @Override
    public double getRadius() {
        return radius;
    }
}

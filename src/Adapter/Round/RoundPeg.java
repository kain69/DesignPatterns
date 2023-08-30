package Adapter.Round;

public class RoundPeg implements Roundable{

    private final double radius;

    public RoundPeg(double radius) {
        this.radius = radius;
    }

    @Override
    public double getRadius() {
        return radius;
    }
}

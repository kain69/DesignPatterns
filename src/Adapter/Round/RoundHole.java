package Adapter.Round;

public class RoundHole implements Roundable{

    private final double radius;

    public RoundHole(double radius) {
        this.radius = radius;
    }

    @Override
    public double getRadius() {
        return radius;
    }

    public boolean insert(Roundable roundPeg) {
        return this.getRadius() >= roundPeg.getRadius();
    }
}

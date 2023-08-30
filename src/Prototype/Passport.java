package Prototype;

public class Passport implements Cloneable{
    private final String series;
    private final String numbers;


    public Passport(String series, String numbers) {
        this.series = series;
        this.numbers = numbers;
    }

    @Override
    protected Passport clone() throws CloneNotSupportedException {
        return (Passport) super.clone();
    }
}

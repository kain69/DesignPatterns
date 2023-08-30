package Prototype;

public class Person implements Cloneable{
    private final String name;
    private final int age;
    private Passport passport;

    public Person(String name, int age, Passport passport) {
        this.name = name;
        this.age = age;
        this.passport = passport;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", passport=" + passport +
                '}';
    }

    @Override
    protected Person clone() throws CloneNotSupportedException {
        Person person = (Person) super.clone();
        person.passport = passport.clone();
        return person;
    }
}

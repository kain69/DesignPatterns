package Prototype;

public class Demo {
    public static void main(String[] args) throws CloneNotSupportedException {
        Passport passport = new Passport("1234", "123456");
        Person person1 = new Person("Влад", 22, passport);

        Person person2 = person1.clone();

        System.out.println(person1);
        System.out.println(person2);
    }
}
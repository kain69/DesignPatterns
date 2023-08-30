package Builder;

public class Demo {
    public static void main(String[] args) {
        Person person = Person.builder()
                .firstName("Влад")
                .middleName("Игоревич")
                .lastName("Кармазин")
                .age(22)
                .build();
    }
}
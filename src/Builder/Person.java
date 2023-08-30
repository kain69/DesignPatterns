package Builder;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Person {
    private String firstName;
    private String middleName;
    private String lastName;
    private int age;

    public static Builder builder(){
        return new Builder();
    }

    public static final class Builder {
        private final Person person;

        public Builder() {
            person = new Person();
        }

        public Builder firstName(String firstName) {
            person.firstName = firstName;
            return this;
        }

        public Builder middleName(String middleName) {
            person.middleName = middleName;
            return this;
        }

        public Builder lastName(String lastName) {
            person.lastName = lastName;
            return this;
        }

        public Builder age(int age) {
            person.age = age;
            return this;
        }

        public Person build(){
            return person;
        }
    }
}

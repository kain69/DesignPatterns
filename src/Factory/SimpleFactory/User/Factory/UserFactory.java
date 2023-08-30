package Factory.SimpleFactory.User.Factory;

import Factory.SimpleFactory.User.User;
import Factory.SimpleFactory.User.UserImpl.Admin;
import Factory.SimpleFactory.User.UserImpl.Customer;
import Factory.SimpleFactory.User.UserImpl.Manager;
import Factory.SimpleFactory.User.Enum.UserType;

public class UserFactory {
    public User createUser(UserType type) {
        switch (type) {
            case ADMIN -> {
                return new Admin();
            }
            case MANAGER -> {
                return new Manager();
            }
            case CUSTOMER -> {
                return new Customer();
            }
            default -> throw new UnsupportedOperationException();
        }
    }
}

package Factory.FactoryMethod.Employee.EmployeeImpl;

import Factory.FactoryMethod.Employee.Employee;

public class Programmer extends Employee {
    @Override
    public void doSomething() {
        System.out.println("coding...");
    }
}

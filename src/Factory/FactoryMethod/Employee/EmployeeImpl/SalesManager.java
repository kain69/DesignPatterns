package Factory.FactoryMethod.Employee.EmployeeImpl;

import Factory.FactoryMethod.Employee.Employee;

public class SalesManager extends Employee {
    @Override
    public void doSomething() {
        System.out.println("sale...");
    }
}

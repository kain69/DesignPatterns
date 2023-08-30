package Factory.FactoryMethod.Department.DepartmentImpl;

import Factory.FactoryMethod.Department.Department;
import Factory.FactoryMethod.Employee.Employee;
import Factory.FactoryMethod.Employee.EmployeeImpl.Programmer;

public class ITDepartment extends Department {
    @Override
    public Employee createEmployee() {
        return new Programmer();
    }
}

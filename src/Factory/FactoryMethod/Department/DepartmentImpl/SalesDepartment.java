package Factory.FactoryMethod.Department.DepartmentImpl;

import Factory.FactoryMethod.Department.Department;
import Factory.FactoryMethod.Employee.Employee;
import Factory.FactoryMethod.Employee.EmployeeImpl.SalesManager;

public class SalesDepartment extends Department {
    @Override
    public Employee createEmployee() {
        return new SalesManager();
    }
}

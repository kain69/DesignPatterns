
package Factory.FactoryMethod;

import Factory.FactoryMethod.Department.DepartmentImpl.ITDepartment;
import Factory.FactoryMethod.Department.DepartmentImpl.SalesDepartment;
import Factory.FactoryMethod.Employee.Employee;
import Factory.FactoryMethod.Employee.EmployeeImpl.SalesManager;

public class Demo {
    public static void main(String[] args) {
        ITDepartment itDepartment = new ITDepartment();
        Employee programmer = itDepartment.createEmployee();

        SalesDepartment salesDepartment = new SalesDepartment();
        Employee salesManager = salesDepartment.createEmployee();

        programmer.doSomething();
        salesManager.doSomething();
    }
}
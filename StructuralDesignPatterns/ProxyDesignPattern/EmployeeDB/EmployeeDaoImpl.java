package StructuralDesignPatterns.ProxyDesignPattern.EmployeeDB;

import java.util.HashMap;
import java.util.Map;

public class EmployeeDaoImpl implements EmployeeDao {

    Map<Integer, Employee> database;

    EmployeeDaoImpl() {
        this.database = new HashMap<>();
    }

    @Override
    public void createEmployee(String client, Employee employee) throws Exception {

        this.database.put(employee.employeeID, employee);
        System.out.println("Created new Row in employee Table");

    }

    @Override
    public void deleteEmployee(String client, int employeeID) throws Exception {

        this.database.remove(employeeID);
         System.out.println("Removed Row in employee Table");

    }

    @Override
    public Employee getEmployee(String client, int employeeID) throws Exception {
         System.out.println("fetching data from employee Table");

        if (this.database.containsKey(employeeID)) {
            System.out.println("fetching data from employee Table");
            return this.database.get(employeeID);
        } else {
             System.out.println("fetching data from employee Table");
            return null;
        }

    }

}

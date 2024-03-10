package StructuralDesignPatterns.FacadeDesignPattern.Example1;

public class EmployeeFacade {

    EmployeeDAO employeeDAO;

    EmployeeFacade() {
        employeeDAO = new EmployeeDAO();
    }

    public void insert() {
        // Insert data into Employee Table
        employeeDAO.insert();
    }

    public Employee getEmployeeDetailsByEmailID(String emailID) {
        // Get employee data based on empID

        Employee employee = employeeDAO.getEmployeeDetailsByEmailID(emailID);

        return employee;
    }
}

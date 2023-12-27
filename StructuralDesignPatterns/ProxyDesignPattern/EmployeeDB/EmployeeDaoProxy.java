package StructuralDesignPatterns.ProxyDesignPattern.EmployeeDB;

public class EmployeeDaoProxy implements EmployeeDao {

    EmployeeDao employeeDao;

    EmployeeDaoProxy() {

        employeeDao = new EmployeeDaoImpl();

    }

    @Override
    public void createEmployee(String client, Employee employee) throws Exception {

        if (client.equals("Admin")) {
            employeeDao.createEmployee(client, employee);
        }

        throw new Exception("Access Denied!");
    }

    @Override
    public void deleteEmployee(String client, int employeeID) throws Exception {
        if (client.equals("Admin")) {
            employeeDao.deleteEmployee(client, employeeID);
        }
        throw new Exception("Access Denied!");
    }

    @Override
    public Employee getEmployee(String client, int employeeID) throws Exception {
        if (client.equals("Admin") || client.equals("User")) {
            return employeeDao.getEmployee(client, employeeID);
        }
        throw new Exception("Access Denied!");
    }

}

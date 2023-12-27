package StructuralDesignPatterns.ProxyDesignPattern.EmployeeDB;

public interface EmployeeDao {
    public void createEmployee(String client, Employee employee) throws Exception;
    public void deleteEmployee(String client, int employeeID) throws Exception;
    public Employee getEmployee(String client, int employeeID) throws Exception;

}

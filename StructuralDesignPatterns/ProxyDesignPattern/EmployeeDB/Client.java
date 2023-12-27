package StructuralDesignPatterns.ProxyDesignPattern.EmployeeDB;

public class Client {

    public static void main(String[] args) {
        try {
            Employee employee = new Employee(0, "Jigar");
            Employee employee2 = new Employee(1, "Neel");

            EmployeeDao daoObj = new EmployeeDaoProxy();

            daoObj.createEmployee("Admin", employee);
            daoObj.createEmployee("User", employee2);

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

    }
}

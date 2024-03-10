package StructuralDesignPatterns.FacadeDesignPattern.Example1;

public class EmployeeClient {
    
    public static void main(String[] args) {
        
        EmployeeFacade employeeFacade = new EmployeeFacade();
        employeeFacade.insert();

        employeeFacade.getEmployeeDetailsByEmailID("jigar@gmail.com");
    }
}

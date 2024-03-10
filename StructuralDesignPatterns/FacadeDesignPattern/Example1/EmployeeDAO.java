package StructuralDesignPatterns.FacadeDesignPattern.Example1;

public class EmployeeDAO {

    public void insert(){
        //Insert data into Employee Table
        System.out.println("Employee Data is inserted");
    }

    public void updateEmployeeDetails(){
        //updating data into Employee Table
        System.out.println("Employee Data is updated");
    }

    public Employee getEmployeeDetailsByEmpID(int empID){
        //Get employee data based on empID
        System.out.println("Employee Data is fetched based upon Employee ID");

        return new Employee();
    }
    
    public Employee getEmployeeDetailsByEmailID(String emailID){
        //Get employee data based on empID
        System.out.println("Employee Data is fetched based upon email ID: " + emailID);

        return new Employee();
    }
}

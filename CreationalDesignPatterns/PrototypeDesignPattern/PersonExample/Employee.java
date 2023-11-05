package PrototypeDesignPattern.PersonExample;

public class Employee implements PersonPrototype{

    int employeeID;
    String name;
    private int age;
    private int salary;

    public Employee(int employeeID, String name, int age, int salary) {
        this.employeeID = employeeID;
        this.name = name;
        this.age = age;
        this.salary = salary;
    }

    @Override
    public PersonPrototype clone(){

        return new Employee(employeeID, name, age, salary);
    }

    @Override
    public String toString(){

        return "Employee's ID: " + this.employeeID + ", Name: " + this.name + ", Age: " + this.age +", Salary: " + this.salary;

    }

    


    
}

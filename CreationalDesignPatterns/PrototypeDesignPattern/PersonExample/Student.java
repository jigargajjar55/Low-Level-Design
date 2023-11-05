package PrototypeDesignPattern.PersonExample;

public class Student implements PersonPrototype {


    int rollNumber;
    String name;
    private int age;

    public Student(int rollNumber, String name, int age) {
        this.rollNumber = rollNumber;
        this.name = name;
        this.age = age;
    }

    @Override
    public PersonPrototype clone(){

        return new Student(rollNumber, name, age);

    }

    @Override
    public String toString(){

        return "Student's RollNumber: " + this.rollNumber + ", Name: " + this.name + ", Age: " + this.age;

    }



    
    
}

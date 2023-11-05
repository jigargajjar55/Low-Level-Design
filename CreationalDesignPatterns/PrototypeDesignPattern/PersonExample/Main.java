package PrototypeDesignPattern.PersonExample;

public class Main {

    public static void main(String[] args) {

        Student obj = new Student(1, "Jigar", 24);

        System.out.println(obj.toString());

        Student cloneObj = (Student) obj.clone();

        System.out.println(cloneObj.toString());

        Employee obj1 = new Employee(129,"Neel",22, 223003240);

        System.out.println(obj1.toString());

        Employee cloneObj1 = (Employee)obj1.clone();

        System.out.println(cloneObj1.toString());

    }

}

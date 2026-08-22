package PrototypeDesignPattern.PersonExample;

public class Main {

    public static void main(String[] args) {

        PersonPrototype obj = new Student(1, "Jigar", 24);

        System.out.println(obj.toString());

        PersonPrototype cloneObj = obj.clone();

        System.out.println(cloneObj.toString());

        PersonPrototype obj1 = new Employee(129,"Neel",22, 223003240);

        System.out.println(obj1.toString());

        PersonPrototype cloneObj1 = obj1.clone();

        System.out.println(cloneObj1.toString());

    }

}

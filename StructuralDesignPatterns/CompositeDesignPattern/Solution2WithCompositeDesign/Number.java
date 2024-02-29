package StructuralDesignPatterns.CompositeDesignPattern.Solution2WithCompositeDesign;

public class Number implements ArithmeticExp {

    int number;

    public Number(int number) {
        this.number = number;
    }

    @Override
    public int evalute() {
        System.out.println("Number is: " + number);

        return number;
    }

}

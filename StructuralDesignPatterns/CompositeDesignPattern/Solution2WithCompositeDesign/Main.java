package StructuralDesignPatterns.CompositeDesignPattern.Solution2WithCompositeDesign;

public class Main {

    public static void main(String[] args) {

        ArithmeticExp two = new Number(2);
        ArithmeticExp one = new Number(1);
        ArithmeticExp seven = new Number(7);

        Expression addExpression = new Expression(one, seven, OperatorType.ADD);
        Expression mulExpression = new Expression(two, addExpression, OperatorType.MULTIPLY);

        mulExpression.evalute();
    }

}

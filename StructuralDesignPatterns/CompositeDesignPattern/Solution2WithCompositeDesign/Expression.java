package StructuralDesignPatterns.CompositeDesignPattern.Solution2WithCompositeDesign;

public class Expression implements ArithmeticExp {

    ArithmeticExp leftExpression;
    ArithmeticExp rightExpression;
    OperatorType operatorType;

    public Expression(ArithmeticExp leftExpression, ArithmeticExp rightExpression, OperatorType operatorType) {
        this.leftExpression = leftExpression;
        this.rightExpression = rightExpression;
        this.operatorType = operatorType;
    }

    @Override
    public int evalute() {

        int value = 0;

        switch (operatorType) {
            case ADD:
                value = leftExpression.evalute() + rightExpression.evalute();
                break;

            case SUBTRACT:
                value = leftExpression.evalute() - rightExpression.evalute();
                break;

            case MULTIPLY:
                value = leftExpression.evalute() * rightExpression.evalute();
                break;
            case DIVISION:
                value = leftExpression.evalute() / rightExpression.evalute();
                break;
        }
        System.out.println("Expression value is: " + value);

        return value;
    }

}

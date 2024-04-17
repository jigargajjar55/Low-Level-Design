package InterpreterDesignPattern.Example2;


public class MultiplyNonTerminalExpression implements AbstractExpression {

    AbstractExpression leftExpression;
    AbstractExpression rightExpression;

    public MultiplyNonTerminalExpression(AbstractExpression leftExpression, AbstractExpression rigthExpression) {
        this.leftExpression = leftExpression;
        this.rightExpression = rigthExpression;
    }

    @Override
    public int interpret(Context context) {

        return (leftExpression.interpret(context) * rightExpression.interpret(context));

    }

}

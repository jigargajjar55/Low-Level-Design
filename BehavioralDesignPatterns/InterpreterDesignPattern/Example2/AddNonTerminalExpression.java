package InterpreterDesignPattern.Example2;


public class AddNonTerminalExpression implements AbstractExpression {

    AbstractExpression leftExpression;
    AbstractExpression rightExpression;

    public AddNonTerminalExpression(AbstractExpression leftExpression, AbstractExpression rigthExpression) {
        this.leftExpression = leftExpression;
        this.rightExpression = rigthExpression;
    }

    @Override
    public int interpret(Context context) {

        return (leftExpression.interpret(context) + rightExpression.interpret(context));

    }

}

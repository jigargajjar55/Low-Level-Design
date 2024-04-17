package InterpreterDesignPattern.Example3;

public class Client {
    public static void main(String[] args) {

        Context context = new Context();
        context.put("a", 10);
        context.put("b", 20);

        AbstractExpression expression = new BinaryNonTerminalExpression(new NumberTerminalExpression("b"),
                new BinaryNonTerminalExpression(new NumberTerminalExpression("b"), new NumberTerminalExpression("a"),
                        '/'),
                '*');

        int result = expression.interpret(context);
        System.out.println("Result: " + result);

    }
}

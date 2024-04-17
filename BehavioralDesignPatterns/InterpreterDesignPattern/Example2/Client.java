package InterpreterDesignPattern.Example2;

public class Client {
    public static void main(String[] args) {

        Context context = new Context();
        context.put("a",10);
        context.put("b",20);

        AbstractExpression expression = new MultiplyNonTerminalExpression(new NumberTerminalExpression("a"), new AddNonTerminalExpression(new NumberTerminalExpression("a"), new NumberTerminalExpression("b")));

        int result = expression.interpret(context);
        System.out.println("Result: "+result);
        
    }
}

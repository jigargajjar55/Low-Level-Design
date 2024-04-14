package TemplateDesignPattern.OrderExample;

public class TextPrinter extends OrderPrinter {

    @Override
    public void start() {

        System.out.println("Start a TextPrinter!");

    }

    @Override
    public void formatOrderNo() {

        System.out.println("Format Order No by Text Printer.");

    }

    @Override
    public void end() {
        System.out.println("End a Text Printer!");
    }

    @Override
    public void formatOrderBody() {
        System.out.println("Format Order Body by Text Printer");
    }

}

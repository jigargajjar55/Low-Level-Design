package TemplateDesignPattern.OrderExample;

public class HTMLPrinter extends OrderPrinter {

    @Override
    public void start() {

        System.out.println("Start an HTML Printer!");

    }

    @Override
    public void formatOrderNo() {
        System.out.println("Format Order No by HTML Printer");
    }

    @Override
    public void end() {
        System.out.println("End an HTML Printer!");
    }

    @Override
    public void formatOrderBody() {
        System.out.println("Format Order Body by HTML Printer");
    }

}

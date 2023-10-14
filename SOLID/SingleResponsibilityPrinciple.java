package SOLID;

//S :- Single Responsibility Principle
//A Class should have only 1 reason to change

public class SingleResponsibilityPrinciple {

    class Marker {
        String name;
        String color;
        int year;
        int price;

        public Marker(String name, String color, int year, int price) {
            this.name = name;
            this.color = color;
            this.year = year;
            this.price = price;
        }
    }

    // This class have 3 reason to change.
    // 1) Calculate Total logic
    // 2) Print Invoice logic
    // 3) Save to DB logic
    class Invoice0 {
        // Inovice has a marker relationship. ('Has a')
        private Marker marker;
        private int quantity;

        public Invoice0(Marker marker, int quantity) {
            this.marker = marker;
            this.quantity = quantity;
        }

        public int calculateTotal() {
            int price = ((marker.price) * this.quantity);
            return price;
        }

        public void printInvoice() {
            // print the Invoice
        }

        public void saveToDB() {
            // Save the data into DB
        }

    }

    // We should re-structure this class such a way that,
    // Each class have Single Responsiblity now

    // For Invoice calculation logic
    class Invoice {
        // Inovice has a marker relationship. ('Has a')
        private Marker marker;
        private int quantity;

        public Invoice(Marker marker, int quantity) {
            this.marker = marker;
            this.quantity = quantity;
        }

        public int calculateTotal() {
            int price = ((marker.price) * this.quantity);
            return price;
        }
    }

    // For save DB
    class InvoiceDao {
        Invoice invoice;

        public InvoiceDao(Invoice invoice) {
            this.invoice = invoice;
        }

        public void saveToDB() {
            // Save into the DB
        }
    }

    // for Inovice print
    class InvoicePrinter {
        private Invoice invoice;

        public InvoicePrinter(Invoice invoice) {
            this.invoice = invoice;
        }

        public void print() {
            // print the invoice
        }
    }

}
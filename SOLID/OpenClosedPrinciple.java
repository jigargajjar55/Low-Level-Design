package SOLID;

import SOLID.SingleResponsibilityPrinciple.Invoice;

//O :- Open/Closed Principle
// Open for Extension but Closed for Modification

public class OpenClosedPrinciple {

    
     // For save DB
    class InvoiceDao0 {
        Invoice invoice;

        public InvoiceDao0(Invoice invoice) {
            this.invoice = invoice;
        }

        public void saveToDB() {
            // Save into the DB
        }
    }



    //Above class is already tested and Prod Live.

    //Now we receive new requirements, Save it to file also.
   
    class InvoiceDao1 {
        Invoice invoice;

        public InvoiceDao1(Invoice invoice) {
            this.invoice = invoice;
        }

        public void saveToDB() {
            // Save into the DB
        }
        public void saveToFile(String fileName) {
            // Save into the File
        }
    }
    //Above class doesn't follow Open/Closed principle.


    
    //So instead of modify class, we will extend the existing class or Interface
    interface InvoiceDao{    
        public void save(Invoice invoice);
    }

    class DatabaseInvoiceDao implements InvoiceDao{
        
        @Override
        public void save(Invoice invoice){
            //Save to DB
        }
    }

    class FileInvoiceDao implements InvoiceDao{
        
        @Override
        public void save(Invoice invoice){
            //Save to File
        }
    }


    
}

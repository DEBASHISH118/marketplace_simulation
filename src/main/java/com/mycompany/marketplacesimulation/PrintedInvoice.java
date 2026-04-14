
package com.mycompany.marketplacesimulation;

public class PrintedInvoice extends Invoice {
    public PrintedInvoice(int invoiceID) { super(invoiceID); }

    @Override
    public String generateOutput() {
        return "Generating Printed Invoice #" + invoiceID + " [Sent to Printer Hub]";
    }
}
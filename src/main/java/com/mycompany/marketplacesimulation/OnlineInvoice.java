
package com.mycompany.marketplacesimulation;

public class OnlineInvoice extends Invoice {
    public OnlineInvoice(int invoiceID) { super(invoiceID); }

    @Override
    public String generateOutput() {
        return "Generating Online Invoice #" + invoiceID + " [Emailed to Customer]";
    }
}
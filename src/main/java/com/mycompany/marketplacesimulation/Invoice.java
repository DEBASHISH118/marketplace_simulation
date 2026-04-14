
package com.mycompany.marketplacesimulation;

import java.util.Date;

public abstract class Invoice {
    protected int invoiceID;
    protected Date issueDate;

    public Invoice(int invoiceID) {
        this.invoiceID = invoiceID;
        this.issueDate = new Date();
    }

    public abstract String generateOutput();
}
package com.invoiceprocessingsystem.server.services;

import com.invoiceprocessingsystem.server.model.Invoice;

import java.util.List;

public interface InvoiceService {

    public Invoice adddInvoice(Invoice invoice);

    public List<Invoice> getInvoices();


    public Invoice deleteInvoice(long id);
}

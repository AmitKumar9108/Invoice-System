package com.invoiceprocessingsystem.server.controller;

import com.invoiceprocessingsystem.server.model.Invoice;
import com.invoiceprocessingsystem.server.services.InvoiceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin
public class InvoiceController {

    @Autowired
    InvoiceService invoiceService;

    @PostMapping("/invoice")
    public Invoice addInvoice(@RequestBody Invoice invoice){

        return this.invoiceService.adddInvoice(invoice);

    }

    @GetMapping("/invoice")
    public List<Invoice> getInvoices()
    {
        return this.invoiceService.getInvoices();
    }

    @DeleteMapping("/invoice/{id}")
    public Invoice deleteInvoice(@PathVariable String id)
    {
        return this.invoiceService.deleteInvoice(Long.parseLong(id));
    }
}

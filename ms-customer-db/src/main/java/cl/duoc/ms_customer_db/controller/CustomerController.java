package cl.duoc.ms_customer_db.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.AutoWired;
import org.springframework.web.bind.annotation.RestController;

import cl.duoc.ms_customer_db.model.entities.Customer;
import cl.duoc.ms_customer_db.service.CustomerServices;
import org.springframework.web.bind.annotation.GetMapping;

@RestController
public class CustomerController {

    @AutoWired
    CustomerServices customerService;

    @GetMapping("/customers")
    public List<Customer> selectAllCustomer(){
        return customerService.selectAllCustomer();
    }

}

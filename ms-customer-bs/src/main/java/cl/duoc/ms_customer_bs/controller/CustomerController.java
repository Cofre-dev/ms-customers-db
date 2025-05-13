package cl.duoc.ms_customer_bs.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

import cl.duoc.ms_customer_bs.model.dto.CustomerDTO;
import cl.duoc.ms_customer_bs.service.CustomerService;
import org.springframework.web.bind.annotation.GetMapping;

@RestController
public class CustomerController {

    @Autowired
    CustomerService customerService;

    public List<CustomerDTO> selectAllCustomer() {
        return customerService.selectAllCustomer();
    }

}

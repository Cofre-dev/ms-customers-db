package cl.duoc.ms_customer_db.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cl.duoc.ms_customer_db.model.entities.AuthAPI.Customer;
import cl.duoc.ms_customer_db.model.repository.CustomerRepository;

@Service
public class CustomerServices {

    @Autowired
    CustomerRepository customerRepository;

    public List<Customer> selectAllCustomer(){
        List<Customer> listaCustomer = customerRepository.findAll();
        return listaCustomer;
    }

}

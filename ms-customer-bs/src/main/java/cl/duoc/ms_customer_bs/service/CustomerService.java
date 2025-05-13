package cl.duoc.ms_customer_bs.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cl.duoc.ms_customer_bs.clients.CustomerDbFeingClient;
import cl.duoc.ms_customer_bs.model.dto.CustomerDTO;

@Service
public class CustomerService {

    @Autowired
    CustomerDbFeingClient customerDbFeingClient;

    public List<CustomerDTO> selectAllCustomer(){
        List<CustomerDTO> listaClientes = customerDbFeingClient.selectAllCustomer();
        return listaClientes;
    }

}

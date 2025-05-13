package cl.duoc.ms_customer_bs.clients;

import java.util.List;

import org.springframework.cloud.openfeing.FeingClient;
import org.springframework.web.bind.annotation.GetMapping;

import cl.duoc.ms_customer_bs.model.dto.CustomerDTO;

@FeingClient(name = "ms-customer-db", url = "http://localhost:8080/")
public interface CustomerDbFeingClient {

    @GetMapping("customers")
    public List<CustomerDTO> selectAllCustomer();
    
}

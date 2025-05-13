package cl.duoc.ms_customer_bs.model.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgConstructor;
import lombok.Setter;
import lombok.ToString;

@AllArgsConstructor
@NoArgConstructor
@Getter
@Setter
@ToString
public class CustomerDTO {
    private Long id;
    private String username;
    private String password;
    private String name;
    private String last_name;
    private String email;
}



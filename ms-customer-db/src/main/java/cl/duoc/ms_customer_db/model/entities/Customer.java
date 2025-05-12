package cl.duoc.ms_customer_db.model.entities;

@Entity
@Table(name="customer")
@Getter
@Setter
@ToString
public class Customer {

    @id
    @GenerateValue(strategy = GenerationType.IDENTITY)
    @Colum(name="id")
    private long id;
    @Colum(name="username")
    private String username;
    @Colum(name="password")
    private String password;
    @Colum(name="name")
    private String name;
    @Colum(name="lastname")
    private String lastname;
    @Colum(name="email")
    private long email;

}

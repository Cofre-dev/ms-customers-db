package cl.duoc.ms_customer_db.model.entities;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Entity
@Table(name="Payment_transaction")
@Getter
@Setter
@ToString
public class Payment_transaction {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id")
    private long id;
    @Column(name="order_id")
    private String order_id;
    @Column(name="transaction_id")
    private int transaction_id;
    @Column(name="amount")
    private double amount;
    @Column(name="currency")
    private String currency;
    @Column(name="status")
    private String status;
    @Column(name="transaction_date")
    private String transaction_date;
    @Column(name="payment_method")
    private String payment_method; 
    
}

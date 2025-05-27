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
@Table(name="order")
@Getter
@Setter
@ToString
public class Order {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id")
    private long id;
    @Column(name="user_id")
    private String user_id;
    @Column(name="create_at")
    private String create_at;
    @Column(name="delivery_option")
    private String delivery_option;
    @Column(name="status")
    private String status;
    @Column(name="payment_status")
    private String payment_status;
    @Column(name="total_amount")
    private double total_amount;
}

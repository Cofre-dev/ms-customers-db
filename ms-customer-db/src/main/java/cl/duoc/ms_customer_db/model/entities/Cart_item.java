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
@Table(name="cart_item")
@Getter
@Setter
@ToString
public class Cart_item {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id")
    private long id;
    @Column(name="cart_id")
    private String cart_id;
    @Column(name="product_id")
    private int product_id;
    @Column(name="quantity")
    private double quantity;

}

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
@Table(name="order_item")
@Getter
@Setter
@ToString
public class Delivery {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id")
    private long id;
    @Column(name="order_id")
    private String order_id;
    @Column(name="prepared_by")
    private String prepared_by;
    @Column(name="delivered_by")
    private String delivered_by;
    @Column(name="delivered_at")
    private String delivered_at;

}

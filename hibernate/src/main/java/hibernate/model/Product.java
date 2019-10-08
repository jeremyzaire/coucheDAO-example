package hibernate.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;
import java.io.Serializable;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "PRODUCT_HIBERNATE",
        uniqueConstraints = { @UniqueConstraint(columnNames = { "product_id" }) })
public class Product implements Serializable {
    @Id
    @Column(name = "product_id")
    private int id;

    @Column(name = "content")
    private String content;
}



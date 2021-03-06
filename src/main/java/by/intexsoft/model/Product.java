package by.intexsoft.model;

import javax.persistence.*;

/**
 * Description database table "user"
 */
@Entity
@Table
public class Product extends BaseEntity{

    /**
     * Product name
     */
    @Column
    public String name;

    /**
     * Product cost
     */
    @Column
    public Double cost;

    /**
     * Product type
     */
    @Column
    public String type;

    /**
     * ManyToOne relation to {@link Stock} entity
     */
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "stock_id")
    public Stock stock;
}

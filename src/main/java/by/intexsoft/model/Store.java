package by.intexsoft.model;

import javax.persistence.*;
import java.util.List;

/**
 * Description database table "store"
 */
@Entity
@Table
public class Store extends BaseEntity {

    /**
     * Store name
     */
    @Column
    public String name;

    /**
     * ManyToMany relation to {@link Stock} entities
     */
    @ManyToMany(targetEntity = Stock.class, fetch = FetchType.EAGER)
    @JoinTable(
            name = "stock_store",
            joinColumns = {@JoinColumn(name = "store_id")},
            inverseJoinColumns = {@JoinColumn(name = "stock_id")}
            )
    public List<Stock> stockList;
}

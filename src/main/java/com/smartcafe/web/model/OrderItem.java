package com.smartcafe.web.model;

import javax.persistence.*;

/**
 * Created by suxarina on 3/31/2016.
 */
@Entity
@Table(name = "order_item", schema = "smart_cafe", catalog = "")
public class OrderItem {
    private int id;
    private int quantity;

    @Id
    @Column(name = "id", nullable = false)
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Basic
    @Column(name = "quantity", nullable = false)
    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        OrderItem orderItem = (OrderItem) o;

        if (id != orderItem.id) return false;
        if (quantity != orderItem.quantity) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + quantity;
        return result;
    }
}

package com.egen.model;

import com.egen.model.enums.OrderStatus;

import java.sql.Timestamp;
import java.util.*;
import javax.persistence.*;

@Entity
@Table(name ="orders")
public class Order {
    /*private  String id;

    public Order(String id){
        this.id = id;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }*/
    @Id
    @Column(name ="order_id")
    private String orderId;

    @Column(name="order_status")
    private OrderStatus orderStatus;

    @Column(name="customer_id")
    private String customerId;

    @Column(name="total")
    private Double total;

    @Column(name="tax")
    private Double tax;

    @Column(name ="ordered_date")
    private Timestamp orderedDate;

    @Column(name ="modified_date")
    private Timestamp modifiedDate;

    @OneToOne
    @JoinColumn(name="order_id", referencedColumnName = "order_id")
    private Shipping shipping;

    @OneToOne
    @JoinColumn(name="order_id", referencedColumnName = "order_id")
    private Address address;

    @OneToMany
    @JoinColumn(name="order_id", referencedColumnName = "order_id")
    private List<Item> items;

    public Order() { }

    public Order( OrderStatus orderStatus, String customerId, Double total, Double tax, Timestamp orderedDate, Timestamp modifiedDate) {
        this.orderId = UUID.randomUUID().toString();
        this.orderStatus = orderStatus;
        this.customerId = customerId;
        this.total = total;
        this.tax = tax;
        this.orderedDate = orderedDate;
        this.modifiedDate = modifiedDate;
    }

    public String getOrderId() {
        return orderId;
    }

    public void setOrderId(String orderId) {
        this.orderId = orderId;
    }

    public OrderStatus getOrderStatus() {
        return orderStatus;
    }

    public void setOrderStatus(OrderStatus orderStatus) {
        this.orderStatus = orderStatus;
    }

    public String getCustomerId() {
        return customerId;
    }

    public void setCustomerId(String customerId) {
        this.customerId = customerId;
    }

    public Double getTotal() {
        return total;
    }

    public void setTotal(Double total) {
        this.total = total;
    }

    public Double getTax() {
        return tax;
    }

    public void setTax(Double tax) {
        this.tax = tax;
    }

    public Timestamp getOrderedDate() {
        return orderedDate;
    }

    public void setOrderedDate(Timestamp orderedDate) {
        this.orderedDate = orderedDate;
    }

    public Timestamp getModifiedDate() {
        return modifiedDate;
    }

    public void setModifiedDate(Timestamp modifiedDate) {
        this.modifiedDate = modifiedDate;
    }
}

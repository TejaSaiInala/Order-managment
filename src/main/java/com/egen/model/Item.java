package com.egen.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.UUID;

@Entity
@Table(name="items")
public class Item {

    @Id
    @Column(name = "item_id")
    private String itemId;

    @Column(name = "item_name")
    private String itemName;

    @Column(name = "item_quantity")
    private int itemQuantity;

    @Column(name = "item_subtotal")
    private Double subTotal;

    @Column(name = "order_id")
    private String orderId;

    public Item() {
        this.itemId = UUID.randomUUID().toString();
    }

    public Item( String itemName, int itemQuantuty, Double subTotal, String orderId) {
        //this.itemId = itemId;
        this.itemName = itemName;
        this.itemQuantity = itemQuantuty;
        this.subTotal = subTotal;
        this.orderId = orderId;
    }

    public String getItemId() {
        return itemId;
    }

    public void setItemId(String itemId) {
        this.itemId = itemId;
    }

    public String getItemName() {
        return itemName;
    }

    public void setItemName(String itemName) {
        this.itemName = itemName;
    }

    public int getItemQuantity() {
        return itemQuantity;
    }

    public void setItemQuantity(int itemQuantity) {
        this.itemQuantity = itemQuantity;
    }

    public Double getSubTotal() {
        return subTotal;
    }

    public void setSubTotal(Double subTotal) {
        this.subTotal = subTotal;
    }

    public String getOrderId(){ return this.orderId; }

    public void setOrderId(String id){ this.orderId = id;}
}

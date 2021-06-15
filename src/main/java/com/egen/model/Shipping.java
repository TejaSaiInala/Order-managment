package com.egen.model;

import com.egen.model.enums.PickupType;

import javax.persistence.*;
import java.util.UUID;

@Entity
@Table(name="shipping")
public class Shipping {

    @Id
    @Column(name="shipping_id")
    private String shippingId;

    @Column(name="charges")
    private Double charges;

    @Column(name="pickup_type")
    private PickupType pickupType;

    @Column(name = "order_id")
    private String orderId;

    @Column(name = "address_id")
    private String addressId;

    public Shipping() {
        this.shippingId = UUID.randomUUID().toString();
    }

    public Shipping( Double charges, PickupType pickupType) {
        //this.shippingId = shippingId;
        this.charges = charges;
        this.pickupType = pickupType;
    }

    public String getShippingId() {
        return shippingId;
    }

    public void setShippingId(String shippingId) {
        this.shippingId = shippingId;
    }

    public Double getCharges() {
        return charges;
    }

    public void setCharges(Double charges) {
        this.charges = charges;
    }

    public PickupType getPickupType() {
        return pickupType;
    }

    public void setPickupType(PickupType pickupType) {
        this.pickupType = pickupType;
    }
}

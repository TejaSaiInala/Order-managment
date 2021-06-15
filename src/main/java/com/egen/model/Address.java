package com.egen.model;

import javax.persistence.*;
import java.util.UUID;

@Entity
@Table(name="addresses")
public class Address {

    @Id
    @Column(name="address_id")
    private String addressId;

    @Column(name="addr_line1")
    private String addrLine1;

    @Column(name="addr_line2")
    private String addrLine2;

    @Column(name="city")
    private String city;

    @Column(name="state")
    private String state;

    @Column(name="zip")
    private String zip;

    @OneToOne
    @JoinColumn(name ="address_id",referencedColumnName = "shipping_id")
    private Shipping shipping;

    public Address() {
        this.addressId = UUID.randomUUID().toString();
    }

    public Address(String addrLine1, String addrLine2, String city, String state,
                   String zip) {
        this.addrLine1 = addrLine1;
        this.addrLine2 = addrLine2;
        this.city = city;
        this.state = state;
        this.zip = zip;
    }

    public String getAddressId(){
        return addressId;
    }

    public String getAddrLine1() {
        return addrLine1;
    }

    public void setAddrLine1(String addrLine1) {
        this.addrLine1 = addrLine1;
    }

    public String getAddrLine2() {
        return addrLine2;
    }

    public void setAddressId(String id){
        this.addressId = id;
    }

    public void setAddrLine2(String addrLine2) {
        this.addrLine2 = addrLine2;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getZip() {
        return zip;
    }

    public void setZip(String zip) {
        this.zip = zip;
    }

}

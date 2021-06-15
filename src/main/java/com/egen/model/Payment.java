package com.egen.model;

import com.egen.model.enums.PaymentType;

import javax.persistence.*;
import java.sql.Timestamp;
import java.util.UUID;

@Entity
@Table(name="payments")
public class Payment {

    @Id
    @Column(name ="payment_id")
    private String paymentId;

    @Column(name ="payment_type")
    private PaymentType paymentType;

    @Column(name ="payment_date")
    private Timestamp paymentDate;

    @Column(name ="confirmation_num")
    private String confirmationNumber;

    @Column(name = "order_id")
    private String order_id;

    @Column(name = "address_id")
    private String addressId;

    public Payment() {
        this.paymentId = UUID.randomUUID().toString();
    }

    public Payment( PaymentType paymentType, Timestamp paymentDate, String confirmationNumber) {
        //this.paymentId = paymentId;
        this.paymentType = paymentType;
        this.paymentDate = paymentDate;
        this.confirmationNumber = confirmationNumber;
    }

    public String getAddressId(){
        return addressId;
    }

    public void setAddressId(String id){
        this.addressId = id;
    }

    public String getPaymentId() {
        return paymentId;
    }

    public void setPaymentId(String paymentId) {
        this.paymentId = paymentId;
    }

    public PaymentType getPaymentType() {
        return paymentType;
    }

    public void setPaymentType(PaymentType paymentType) {
        this.paymentType = paymentType;
    }

    public Timestamp getPaymentDate() {
        return paymentDate;
    }

    public void setPaymentDate(Timestamp paymentDate) {
        this.paymentDate = paymentDate;
    }

    public String getConfirmationNumber() {
        return confirmationNumber;
    }

    public void setConfirmationNumber(String confirmationNumber) {
        this.confirmationNumber = confirmationNumber;
    }
}

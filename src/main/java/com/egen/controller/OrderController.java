package com.egen.controller;

import com.egen.model.Order;
import com.egen.model.enums.OrderStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.sql.Time;
import java.sql.Timestamp;
import java.time.ZonedDateTime;
import java.util.Collections;
import java.util.List;

@RestController
public class OrderController {
    /**
     * implement the following endpoints
     */

    @GetMapping("order")
    public ResponseEntity<List<Order>> getAllOrders(){
        //TODO
        Timestamp t = new Timestamp(2021,6,15,11,30,00,5555);
        return ResponseEntity.ok(Collections.singletonList(new Order(OrderStatus.PLACED,"cid",200.00,12.00,t,t)));
    }

    public ResponseEntity<List<Order>> getOrderById(String id){
        //TODO
        return null;
    }

    public ResponseEntity<List<Order>> getAllOrdersWithInInterval(ZonedDateTime startTime, ZonedDateTime endTime){
        //TODO
        return null;
    }

    public ResponseEntity<List<Order>> top10OrdersWithHighestDollarAmountInZip(String zip){
        //TODO
        return null;
    }

    public ResponseEntity<Order> placeOrder(Order order){
        return null;
    }

    public ResponseEntity<Order> cancelOrder(Order order){
        return null;
    }

    public ResponseEntity<Order> updateOrder(Order order){
        return null;
    }
}

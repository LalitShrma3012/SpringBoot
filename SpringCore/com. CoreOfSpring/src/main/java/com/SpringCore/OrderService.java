package com.SpringCore;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

//@Component
public class OrderService {

    PaymentService payment;

//    public OrderService(PaymentService payment){
//        this.payment = payment;
//    }

    @Autowired
    public void setPayment(PaymentService payment){
        this.payment = payment;
    }

    public void placeOrder(){

        // Order payment code
        payment.pay();
        System.out.println("Order placed!!");
    }
}

package com.SpringCore;


import org.springframework.stereotype.Component;

//@Component
public class CardPaymentService implements PaymentService{
    @Override
    public void pay() {
        System.out.println("Amount paid successfully with card!!");
    }
}

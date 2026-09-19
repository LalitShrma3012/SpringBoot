package com.SpringCore;


import org.springframework.stereotype.Component;

//@Component
public class UpiPaymentService implements PaymentService{

    @Override
    public void pay(){
        System.out.println("Amount paid successfully with UPI!!");
    }
}

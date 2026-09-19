package com.SpringCore;


import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.resilience.retry.MethodRetryEvent;


@Configuration
//@ComponentScan("com.SpringCore")
public class AppConfig {

    @Bean
    public OrderService createOrderService(){
        return new OrderService();
    }

    @Bean
    public UpiPaymentService createUpiPaymentService(){
        return new UpiPaymentService();
    }

    @Bean
    @Primary
    public CardPaymentService createCardPaymentService(){
        return new CardPaymentService();
    }

    @Bean
    public User createUser(){
        return new User(32, "Aditya");
    }


}
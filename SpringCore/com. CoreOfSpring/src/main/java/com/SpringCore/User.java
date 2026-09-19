package com.SpringCore;

import org.springframework.stereotype.Component;

//@Component
public class User {

    private int age;
    private String name;

    public User(int age, String name){
        this.age = age;
        this.name = name;
    }

    public void userDetails(){
        System.out.println("User name - " + this.name);
        System.out.println("User age - " + this.age);
    }

}

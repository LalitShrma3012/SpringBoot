package com.SpringBoot.repository;


import com.SpringBoot.entity.Student;

import java.util.HashMap;
import java.util.Map;

public class StudentRepository {

    private Map<Long, Student> studentDB;

    public StudentRepository(){
        studentDB = new HashMap<>();
    }



}

package com.Learning.CRUD.dto;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotEmpty;

public class StudentUpdateRequestDto {

    @NotBlank(message = "Name is required")
    private String name;

    @NotEmpty(message = "Roll number is required!")
    private Long rollNo;

    @NotEmpty(message = "Age is required!")
    private int age;

    @NotBlank(message = "Subject is required!")
    private String subject;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Long getRollNo() {
        return rollNo;
    }

    public void setRollNo(Long rollNo) {
        this.rollNo = rollNo;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

}

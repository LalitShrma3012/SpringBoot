package com.Learning.CRUD.dto;

import java.time.LocalDateTime;

public class StudentUpdateResponseDto {
    private String name;
    private Long rollNo;
    private String email;
    private int age;
    private String subject;
    private String message;
    private LocalDateTime updatedAt;


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

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public void setUpdatedAt(LocalDateTime now) {
        this.updatedAt = now;
    }

    public LocalDateTime getUpdatedAt() {
        return updatedAt;
    }
}

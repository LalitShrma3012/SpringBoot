package com.Learning.CRUD.dto;

import jakarta.validation.constraints.*;

public class StudentCreateRequestDto {


    @NotBlank(message = "Student name cannot be null or blank")
    @Size(min = 2, max = 50, message = "Student name must be within 2 to 50 characters long")
    private String name;

    @NotNull(message = "Roll Number is required")
    @Positive(message = "Roll Number must be greater than zero!!")
    private Long rollNo;

    @Email(message = "Student email must in a proper email format")
    private String email;

    @Positive(message = "Age must be positive")
    @Min(value=3, message = "Student must be at least 3 years old")
    private int age;

    @NotBlank(message="Subject is required")
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

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
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

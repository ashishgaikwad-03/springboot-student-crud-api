package com.example.crudSpringBootDemo.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.validation.constraints.*;
import org.springframework.context.annotation.Primary;

@Entity
public class Student {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @NotBlank(message = "Name cannot be empty or spaces")
    @Size(min = 2, max = 50, message = "Name must be betweem 2 and 50 charcaters")
    private String name;

    @NotNull(message = "Age cannot be left empty")
    @Min(value = 18, message = "Must be atleast 18 years old")
    @Max(value = 100, message = "Age cannot exceed 100")
    private int age;

    @NotBlank(message = "Email address is mandatory")
    @Email(message = "Please provide a valid email address")
    private String email;

    @NotNull(message = "Roll number is mandatory")
    @Positive(message = "Roll number must be valid positive number")
    private int rollNo;

    @NotBlank(message = "Subject cannot be left blank")
    private String subject;

    private Boolean deleted;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
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

    public int getRollNo() {
        return rollNo;
    }

    public void setRollNo(int rollNo) {
        this.rollNo = rollNo;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public Boolean getDeleted() {
        return deleted;
    }

    public void setDeleted(Boolean deleted) {
        this.deleted = deleted;
    }
}

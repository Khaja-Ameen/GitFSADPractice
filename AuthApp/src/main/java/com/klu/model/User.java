package com.klu.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;
    private String email;
    private String password;
    private boolean isVerified;
    private String otp;

    // Default Constructor
    public User() {}

    // Parameterized Constructor
    public User(Long id, String name, String email, String password, boolean isVerified, String otp) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.password = password;
        this.isVerified = isVerified;
        this.otp = otp;
    }

    // Getters
    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public String getPassword() {
        return password;
    }

    public boolean isVerified() {
        return isVerified;
    }

    public String getOtp() {
        return otp;
    }

    // Setters
    public void setId(Long id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setVerified(boolean isVerified) {
        this.isVerified = isVerified;
    }

    public void setOtp(String otp) {
        this.otp = otp;
    }
}
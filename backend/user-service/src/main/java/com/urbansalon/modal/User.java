package com.urbansalon.modal;

import java.time.LocalDateTime;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Email;

@Entity
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotBlank(message = "Full name is required")
    private String fullName;
    @NotBlank(message = "Username is required")
    private String username;
    @NotBlank(message = "Email is required")
    @Email(message = "Email should be in the format of example@example.com")
    private String email;
    @NotBlank(message = "Phone is required")
    private String phone;
    @NotBlank(message = "Role is required")
    private String role;
    @CreationTimestamp
    private LocalDateTime createdAt;
    @UpdateTimestamp
    private LocalDateTime updatedAt;
    @NotBlank(message = "Password is required")
    private String password;

    // Default constructor
    public User() {
    }

    // All-args constructor
    public User(Long id, String fullName, String username, String email, String phone, String role,
            LocalDateTime createdAt, LocalDateTime updatedAt, String password) {
        this.id = id;
        this.fullName = fullName;
        this.username = username;
        this.email = email;
        this.phone = phone;
        this.role = role;
        this.createdAt = createdAt;
        this.updatedAt = updatedAt;
        this.password = password;
    }

    // Getters
    public Long getId() {
        return id;
    }

    public String getFullName() {
        return fullName;
    }

    public String getUsername() {
        return username;
    }

    public String getEmail() {
        return email;
    }

    public String getPhone() {
        return phone;
    }

    public String getRole() {
        return role;
    }

    public LocalDateTime getCreatedAt() {
        return createdAt;
    }

    public LocalDateTime getUpdatedAt() {
        return updatedAt;
    }

    public String getPassword() {
        return password;
    }

    // Setters
    public void setId(Long id) {
        this.id = id;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public void setCreatedAt(LocalDateTime createdAt) {
        this.createdAt = createdAt;
    }

    public void setUpdatedAt(LocalDateTime updatedAt) {
        this.updatedAt = updatedAt;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}

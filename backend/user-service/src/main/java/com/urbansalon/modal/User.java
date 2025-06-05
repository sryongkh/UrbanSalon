package com.urbansalon.modal;

import java.time.LocalDateTime;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;
import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Email;
import lombok.Data;
import lombok.Builder;
import lombok.NoArgsConstructor;
import lombok.AllArgsConstructor;

@Entity
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
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
}

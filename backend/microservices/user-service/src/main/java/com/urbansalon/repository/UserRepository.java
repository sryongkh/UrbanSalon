package com.urbansalon.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.urbansalon.modal.User;

public interface UserRepository extends JpaRepository<User, Long> {
    User findByEmail(String email);
}

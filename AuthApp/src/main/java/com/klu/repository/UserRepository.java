package com.klu.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.klu.model.User;

import jakarta.persistence.Id;



public interface UserRepository extends JpaRepository<User, Long> {
	Optional<User>findByEmail(String email);

}

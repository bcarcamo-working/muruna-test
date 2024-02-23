package com.muruna.user.repository;

import java.util.Optional;

import org.springframework.data.repository.CrudRepository;

import com.muruna.user.model.User;

public interface UserRepository extends CrudRepository<User, Long> {
    Optional<User> findByEmail(String email);
}
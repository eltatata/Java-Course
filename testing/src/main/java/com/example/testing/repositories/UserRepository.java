package com.example.testing.repositories;

import java.util.Optional;

import com.example.testing.models.User;

public interface UserRepository {
    Optional<User> findById(Long id);
    User save(User user);
    void deleteById(Long id);
}

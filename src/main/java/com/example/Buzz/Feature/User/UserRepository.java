package com.example.Buzz.Feature.User;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.Buzz.Feature.User.Model.User;

public interface UserRepository extends JpaRepository<User, Long> {
    
}

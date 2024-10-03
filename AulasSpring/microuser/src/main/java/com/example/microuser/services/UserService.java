package com.example.microuser.services;

import com.example.microuser.entities.User;
import com.example.microuser.producers.UserProducer;
import com.example.microuser.repositories.UserRepository;
import jakarta.transaction.Transactional;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    private final UserRepository userRepository;
    private final UserProducer userProducer;

    public UserService(UserRepository userRepository, UserProducer userProducer) {
        this.userRepository = userRepository;
        this.userProducer = userProducer;
    }

    @Transactional
    public User save(User user) {
        var savedUser = userRepository.save(user);
        this.userProducer.publishMessageEmail(savedUser);

        return savedUser;
    }
}

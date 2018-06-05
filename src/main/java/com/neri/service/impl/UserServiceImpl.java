package com.neri.service.impl;

import com.neri.repository.UserRepository;
import com.neri.security.entity.User;
import com.neri.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Component;

import java.util.Optional;

/**
 * Created by NeriDev on 05/06/2018.
 */


@Component
public class UserServiceImpl implements UserService {

    @Autowired
    private UserRepository userRepository;

    public User findByEmail(String email) {
        return this.userRepository.findByEmail(email);
    }

    public User createOrUpdate(User user) {
        return this.userRepository.save(user);
    }

    public Optional<User> findById(String id) {
        return this.userRepository.findById(id);
    }

    public void delete(User user) {
        this.userRepository.delete(user);
    }

    public Page<User> findAll(int page, int count) {
        Pageable pages = new PageRequest(page, count);
        return this.userRepository.findAll(pages);
    }
}


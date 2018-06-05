package com.neri.service;

import com.neri.security.entity.User;
import org.springframework.data.domain.Page;
import org.springframework.stereotype.Component;

import java.util.Optional;

/**
 * Created by NeriDev on 05/06/2018.
 */
    @Component
    public interface UserService {

        User findByEmail(String email);

        User createOrUpdate(User user);

        Optional<User> findById(String id);

        void delete(User user);

        Page<User> findAll(int page, int count);



}

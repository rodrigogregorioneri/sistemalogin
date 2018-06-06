package com.neri.security.service;

import com.neri.repository.UserRepository;
import com.neri.security.entity.User;
import com.neri.security.jwt.JwtUserFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

/**
 * Created by NeriDev on 05/06/2018.
 */
@Service
public class UserService {

    @Autowired
    private UserRepository repository;

    public User createUser(User user) {
        System.out.println(user.getEmail());
         return repository.save(user);
    }
}

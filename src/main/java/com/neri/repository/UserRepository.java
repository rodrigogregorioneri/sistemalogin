package com.neri.repository;

import com.neri.security.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.Repository;

/**
 * Created by NeriDev on 05/06/2018.
 */
public interface UserRepository extends JpaRepository<User, String> {

    User findByEmail(String email);

}

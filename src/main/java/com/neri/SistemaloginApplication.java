package com.neri;


import com.neri.security.entity.User;
import com.neri.security.enums.ProfileEnum;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.security.crypto.password.PasswordEncoder;

import com.neri.repository.UserRepository;

import java.util.UUID;


@SpringBootApplication
public class SistemaloginApplication {

	public static void main(String[] args) {
		SpringApplication.run(SistemaloginApplication.class, args);
	}

	@Bean
	CommandLineRunner init(UserRepository userRepository, PasswordEncoder passwordEncoder) {
		return args -> {
			initUsers(userRepository, passwordEncoder);
		};

	}

	private void initUsers(UserRepository userRepository, PasswordEncoder passwordEncoder) {
		//User USER = new User();

		User USER = new User()
				.setId(UUID.randomUUID().toString().toUpperCase())
				.setEmail("rodrigo@intelipost.com")
				.setPassword(passwordEncoder.encode("admin"))
				.setProfile(ProfileEnum.ROLE_ADMIN);

//		admin.setId(UUID.randomUUID().toString().toUpperCase());
//		admin.setEmail("rodrigo@intelipost.com");
//		admin.setPassword(passwordEncoder.encode("admin"));
//		admin.setProfile(ProfileEnum.ROLE_ADMIN);

		User find = userRepository.findByEmail("rodrigo@rodrigo.com");
		if (find == null) {
			userRepository.save(USER);
		}
	}

}

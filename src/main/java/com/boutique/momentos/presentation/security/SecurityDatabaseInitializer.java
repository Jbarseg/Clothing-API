package com.boutique.momentos.presentation.security;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.crypto.password.PasswordEncoder;

import com.boutique.momentos.persistence.datarepository.RoleDataRepository;
import com.boutique.momentos.persistence.datarepository.UserDataRepository;
import com.boutique.momentos.persistence.entity.Role;
import com.boutique.momentos.persistence.entity.User;

@Configuration
public class SecurityDatabaseInitializer {

    @Bean
    public CommandLineRunner initDatabase(UserDataRepository userRepository, RoleDataRepository roleRepository, PasswordEncoder passwordEncoder) {
        return args -> {
            if (((CharSequence) roleRepository.findAll()).isEmpty()) {
                Role adminRole = new Role();
                adminRole.setName("Administrador");
                roleRepository.save(adminRole);

                Role userRole = new Role();
                userRole.setName("Usuario");
                roleRepository.save(userRole);

                User admin = new User();
                admin.setUsername("admin1");
                admin.setPassword(passwordEncoder.encode("contrasena123"));
                admin.setRole(adminRole);
                userRepository.save(admin);

                User user = new User();
                user.setUsername("user1");
                user.setPassword(passwordEncoder.encode("contrasena456"));
                user.setRole(userRole);
                userRepository.save(user);
            }
        };
    }
}
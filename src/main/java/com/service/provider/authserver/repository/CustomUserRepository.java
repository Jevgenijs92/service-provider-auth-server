package com.service.provider.authserver.repository;

import com.service.provider.authserver.model.CustomUser;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface CustomUserRepository extends JpaRepository<CustomUser, String> {
    Optional<CustomUser> findByUsername(String username);
}

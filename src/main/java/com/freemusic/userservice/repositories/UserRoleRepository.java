package com.freemusic.userservice.repositories;

import com.freemusic.userservice.models.UserRole;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRoleRepository extends JpaRepository<UserRole, Integer> {
}

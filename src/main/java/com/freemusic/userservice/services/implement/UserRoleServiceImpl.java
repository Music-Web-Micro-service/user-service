package com.freemusic.userservice.services.implement;

import com.freemusic.userservice.models.UserRole;
import com.freemusic.userservice.repositories.UserRoleRepository;
import com.freemusic.userservice.services.UserRoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserRoleServiceImpl implements UserRoleService {
    @Autowired
    private UserRoleRepository userRoleRepository;

    @Override
    public UserRole getUserRoleById(int userRoleId) {
        return userRoleRepository.getReferenceById(userRoleId);
    }

    @Override
    public void addUserRole(UserRole userRole) {
        userRoleRepository.save(userRole);
    }

    @Override
    public void updateUserRole(UserRole userRole) {
        userRoleRepository.save(userRole);
    }

    @Override
    public void deleteUserRole(int userRoleId) {
        userRoleRepository.deleteById(userRoleId);
    }
}

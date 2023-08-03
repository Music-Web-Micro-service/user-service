package com.freemusic.userservice.services;

import com.freemusic.userservice.models.UserRole;

public interface UserRoleService {

    UserRole getUserRoleById(int userRoleId);

    void addUserRole(UserRole userRole);

    void updateUserRole(UserRole userRole);

    void deleteUserRole(int userRoleId);
}

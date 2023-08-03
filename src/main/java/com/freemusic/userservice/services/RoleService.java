package com.freemusic.userservice.services;

import com.freemusic.userservice.models.Role;

import java.util.List;

public interface RoleService {

    List<Role> getAllRoles();

    Role getRoleById(int roleId);

    void addRole(Role role);

    void updateRole(Role role);

    void deleteRole(int roleId);
}

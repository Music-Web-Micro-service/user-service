package com.freemusic.userservice.services.implement;

import com.freemusic.userservice.models.Role;
import com.freemusic.userservice.repositories.RoleRepository;
import com.freemusic.userservice.services.RoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RoleServiceImpl implements RoleService {

    @Autowired
    private RoleRepository roleRepository;

    @Override
    public List<Role> getAllRoles() {
        return roleRepository.findAll();
    }

    @Override
    public Role getRoleById(int roleId) {
        return roleRepository.getReferenceById(roleId);
    }

    @Override
    public void addRole(Role role) {
        roleRepository.save(role);
    }

    @Override
    public void updateRole(Role role) {
        roleRepository.save(role);
    }

    @Override
    public void deleteRole(int roleId) {
        roleRepository.deleteById(roleId);
    }
}

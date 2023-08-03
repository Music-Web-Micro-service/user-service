package com.freemusic.userservice.controllers;

import com.freemusic.userservice.models.Role;
import com.freemusic.userservice.services.RoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/roles")
public class RoleController {
    @Autowired
    private RoleService roleService;

    @GetMapping("/search/all")
    public List<Role> getAllRoles() {
       return roleService.getAllRoles();
    }

    @GetMapping("/search")
    public Role getRoleById(@RequestParam("roleId") int roleId) {
        return roleService.getRoleById(roleId);
    }

    @PostMapping("/add")
    public void addRole(@RequestBody Role role) {
        roleService.addRole(role);
    }

    @PostMapping("/update")
    public void updateRole(@RequestBody Role role) {
        roleService.updateRole(role);
    }

    @PostMapping("/delete")
    public void deleteRole(@RequestParam("roleId")int roleId) {
        roleService.deleteRole(roleId);
    }

}

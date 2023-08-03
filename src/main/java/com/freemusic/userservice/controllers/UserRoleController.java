package com.freemusic.userservice.controllers;

import com.freemusic.userservice.models.UserRole;
import com.freemusic.userservice.services.UserRoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(name="/user_role")
public class UserRoleController {

    @Autowired
    private UserRoleService userRoleService;


    @GetMapping("/search")
    public UserRole getUserRoleById(@RequestParam("userRoleId") int userRoleId) {
        return userRoleService.getUserRoleById(userRoleId);
    }

    @PostMapping("/add")
    public void addRole(@RequestBody UserRole user_role) {
        userRoleService.addUserRole(user_role);
    }

    @PostMapping("/update")
    public void updateRole(@RequestBody UserRole user_role) {
        userRoleService.updateUserRole(user_role);
    }

    @PostMapping("/delete")
    public void deleteRole(@RequestParam("userRoleId") int userRoleId) {
        userRoleService.deleteUserRole(userRoleId);
    }

}

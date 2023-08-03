package com.freemusic.userservice.mappers;


// UserMapper.java
public class UserMapper {
    //
    // public UserDto toUserDto(User user) {
    //     List<User_roleDto> roleListDto = user.getUserRoleList().stream()
    //             .filter(userRole -> userRole.getRole() != null)
    //             .map(userRole -> new User_roleDto(
    //                     userRole.getUserRoleId(),
    //                     userRole.getUser().getUserId(),
    //                     userRole.getRole().getRoleId()))
    //             .collect(Collectors.toList());
    //
    //     return new UserDto(
    //             user.getUserId(),
    //             roleListDto,
    //             user.getEmail(),
    //             user.getUserName(),
    //             user.getPassword(),
    //             user.getSex(),
    //             user.getPhoneNumber(),
    //             user.getBirth(),
    //             user.getLocation(),
    //             user.getAvatar()
    //     );
    // }

    // You can also define a method for converting a UserDto to a User if needed
    // public User toUser(UserDto userDto) { ... }
}


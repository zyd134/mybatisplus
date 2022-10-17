package com.zhang.controller;


import com.zhang.entity.Users;
import com.zhang.service.IUsersService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * <p>
 * InnoDB free: 6144 kB 前端控制器
 * </p>
 *
 * @author astupidcoder
 * @since 2022-10-17
 */
@RestController
@RequestMapping("/users")
public class UsersController {

    @Autowired
    private IUsersService usersService;

    @PostMapping("/getUsers")
    public Users getUser(){
        return usersService.getById(1);
    }

    @PostMapping("/findAllUser")
    public List<Users> findAllUser(){
        return usersService.findAllUser();
    }

}

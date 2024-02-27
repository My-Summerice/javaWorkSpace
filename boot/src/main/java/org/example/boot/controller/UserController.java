package org.example.boot.controller;

import org.example.boot.dto.UserDTO;
import org.example.boot.entity.User;
import org.example.boot.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
public class UserController {
    @Autowired
    private UserService userService;

    /**
     * 添加用户，并返回添加的信息
     */
    @PostMapping("/user/add")
    @ResponseBody
    public void addUser(@RequestBody UserDTO user) {
        userService.addUser(user);
    }

    /**
     * 根据id获取用户信息
     */
    @PostMapping("/user/get")
    @ResponseBody
    public User getUser(@RequestBody int id) {
        return userService.getUser(id);
    }

    /**
     * 获取用户列表
     */
    @PostMapping("/user/list")
    @ResponseBody
    public List<User> getUserList(@RequestParam(defaultValue = "0") int page, @RequestParam(defaultValue = "10") int size) {
        return userService.getUserList(page, size);
    }
}

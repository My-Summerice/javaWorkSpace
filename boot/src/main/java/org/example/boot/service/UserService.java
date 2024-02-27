package org.example.boot.service;

import org.example.boot.dto.UserDTO;
import org.example.boot.entity.User;

import java.util.List;

public interface UserService {
    /**
     * 添加用户，并返回添加的信息
     */
    void addUser(UserDTO userDTO);

    /**
     * 根据id获取指定用户
     */
    User getUser(int userId);

    /**
     * 获取用户列表
     */
    List<User> getUserList(int page, int pageSize);
}

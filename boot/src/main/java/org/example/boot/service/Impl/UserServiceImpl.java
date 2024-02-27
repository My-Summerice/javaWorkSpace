package org.example.boot.service.Impl;

import org.example.boot.dto.UserDTO;
import org.example.boot.entity.User;
import org.example.boot.mapper.UserMapper;
import org.example.boot.service.UserService;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Repository
public class UserServiceImpl implements UserService {

    private final UserMapper userMapper;

    public UserServiceImpl(UserMapper userMapper) {
        this.userMapper = userMapper;
    }

    /**
     * 添加用户，并返回添加的信息
     */
    @Override
    public void addUser(UserDTO userDTO) {
        try {
            User user = convertToEntity(userDTO);
            userMapper.addUser(user);
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    /**
     * 根据id获取指定用户
     */
    @Override
    public User getUser(int userId) {
        User userReturn = null;
        try {
            userReturn = userMapper.getUserById(userId);
        } catch (Exception e) {
            System.out.println(e);
        }

        return userReturn;
    }

    /**
     * 获取用户列表
     */
    @Override
    public List<User> getUserList(int page, int pageSize) {
        int offset = (page - 1) * pageSize;
        return userMapper.getUserList(offset, pageSize);
    }

    /**
     * DTO对象转Entity对象
     */
    private User convertToEntity(UserDTO userDTO) {
        User user = new User();

        user.setName(userDTO.getName());
        user.setAge(userDTO.getAge());
        user.setGender(userDTO.getGender());

        return user;
    }
}

package org.example.boot.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.example.boot.entity.User;

import java.util.List;

@Mapper
public interface UserMapper {
    /**
     * 添加用户
     */
    void addUser(User user);

    /**
     * 根据id获取一个用户
     */
    User getUserById(long id);

    /**
     * 获取所有用户
     */
    List<User> getUserList(@Param("offset") int offset, @Param("pageSize") int pageSize);
}

package org.zxe.userserver.service;

import org.zxe.userserver.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.zxe.userserver.pojo.User;

@Service
public class UserService {

    @Autowired
    private UserMapper userMapper;
    public User findById(Integer id){
        return userMapper.find(id);
    }
}

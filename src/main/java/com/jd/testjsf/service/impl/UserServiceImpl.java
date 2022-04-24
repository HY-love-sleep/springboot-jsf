package com.jd.testjsf.service.impl;

import com.jd.testjsf.mbg.mapper.UsersMapper;
import com.jd.testjsf.mbg.model.Users;
import com.jd.testjsf.service.UserService;
//import org.apache.catalina.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UsersMapper usersMapper;

    @Override
    public Users getUser(int id) {
        return usersMapper.selectByPrimaryKey(id);
    }

    @Override
    public int insertUser(Users user) {
        return usersMapper.insertSelective(user);
    }

    @Override
    public int deleteUser(int id) {
        return usersMapper.deleteByPrimaryKey(id);
    }

    @Override
    public int updateUser(int id, Users user) {
        user.setId(id);
        return usersMapper.updateByPrimaryKeySelective(user);
    }
}

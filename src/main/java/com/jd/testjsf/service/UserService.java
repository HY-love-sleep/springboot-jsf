package com.jd.testjsf.service;

import com.jd.testjsf.mbg.model.Users;
import org.apache.catalina.User;

public interface UserService {
    Users getUser(int id);

    int insertUser(Users user);

    int deleteUser(int id);

    int updateUser(int id, Users user);
}

package com.jd.testjsf;

import com.apple.eawt.AppEvent;
import com.jd.testjsf.mbg.model.Users;
import com.jd.testjsf.service.UserService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class JsfDemoApplicationTest {

    @Autowired
    private UserService userService;

    @Test
    public void testSelect() {
        Users user = userService.getUser(1);
        System.out.println(user.toString());
    }

    @Test
    public void testInsert() {
        Users user = new Users( 2,"zhangchang", "1122", 24);
        userService.insertUser(user);
    }

    @Test
    public void testDelete() {
        userService.deleteUser(2);
    }

    @Test
    public void testUpdate() {
        Users user = new Users(1, "hongyan", "hy971122", 25);
        userService.updateUser(1, user);
    }
}

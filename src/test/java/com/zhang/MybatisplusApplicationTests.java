package com.zhang;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
class MybatisplusApplicationTests {

    /*@Autowired
    UsersMapper usersMapper;*/

    //查询所有用户
    @Test
    void contextLoads() {
       /* System.out.println("-------------------------");
        List<Users> users = usersMapper.selectList(null);
        for (Users user : users) {
            System.out.println(user);
        }
        System.out.println("-------------------------");*/
    }

    //根据ID查询当前用户
    @Test
    void test1() {
        /*Users user = usersMapper.selectById(2);
        System.out.println(user);*/
    }

}

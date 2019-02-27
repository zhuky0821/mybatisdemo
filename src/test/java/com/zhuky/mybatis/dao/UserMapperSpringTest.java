package com.zhuky.mybatis.dao;

import com.zhuky.mybatis.pojo.User;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.Date;
import java.util.List;

//junit整合spring的测试// 立马开启了spring注解
@RunWith(SpringJUnit4ClassRunner.class)

@ContextConfiguration(locations = "classpath:spring/applicationContext-*.xml") //加载核心配置文件，自动构建spring
public class UserMapperSpringTest {

    @Autowired
    private UserMapper userMapper;

    @Test
    public void testLogin() {
        System.out.println(this.userMapper.login("zhu1", "1"));
    }

    @Test
    public void testQueryUserById() {
        System.out.println(this.userMapper.queryUserById(1l));

        User user = new User();
        user.setId("20");
        user.setName("美女");
        userMapper.updateUser(user);

        System.out.println(this.userMapper.queryUserById(1l));
    }

    @Test
    public void testQueryUserAll() {
        List<User> userList = this.userMapper.queryUserAll();
        for (User user : userList) {
            System.out.println(user);
        }
    }

    @Test
    public void testInsertUser() {
        User user = new User();
        user.setId("10");
        user.setAge(20);
        user.setBirthday(new Date());
        user.setName("大神");
        user.setPassword("123456");
        user.setSex(2);
        user.setUserName("bigGod222");
        this.userMapper.insertUser(user);
        System.out.println(user.getId());
    }

    @Test
    public void testUpdateUser() {
        User user = new User();
        user.setBirthday(new Date());
        user.setName("静静");
        user.setPassword("123456");
        user.setSex(0);
        user.setUserName("Jinjin");
        user.setId("1");
        this.userMapper.updateUser(user);
    }

    @Test
    public void testDeleteUserById() {
        this.userMapper.deleteUserById("10");
    }

    @Test
    public void testQueryCount(){
        System.out.println(this.userMapper.queryCount());
    }

    @Test
    public void testQueryUserList(){
        List<User> users = this.userMapper.queryUserList("i");
        for(User user : users){
            System.out.println(user);
        }
    }

    @Test
    public void testQueryUserByIds(){
        String[] ids = new String[]{"1", "2"};
        List<User> users = this.userMapper.queryUserByIds(ids);
        for (User user:users){
            System.out.println(user);
        }
    }
}

package com.zhuky.mybatis.dao;

import com.zhuky.mybatis.pojo.User;

import java.util.List;

public interface UserDao{
    /**
     * 根据用户ID查找信息
     *
     * @param id
     * @retuen
     */
    public User queryUserById(String id);

    /**
     * 查询所有用户信息
     *
     * @return
     */
    public List<User> queryUserAll();

    /**
     * 新增用户
     *
     * @param user
     */
    public void insertUser(User user);

    /**
     * 更新用户
     *
     * @param user
     */
    public void updateUser(User user);

    /**
     * 根据ID删除用户
     *
     * @param id
     */
    public void deleteUser(String id);

}
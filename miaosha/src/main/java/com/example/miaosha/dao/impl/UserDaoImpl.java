/**
 * @Project Name:miaosha
 * @Package Name:com.example.miaosha.dao.impl
 */
package com.example.miaosha.dao.impl;

import com.example.miaosha.dao.UserDao;
import com.example.miaosha.domain.User;
import com.example.miaosha.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

/**
 * @Description:
 * @Author: ZC
 * @Email: chao_actor@163.com
 * @data: 2018/9/28 23:43
 */
@Repository
public class UserDaoImpl implements UserDao {
    @Autowired
    private UserMapper userMapper;

    @Override
    public int inserUser(User u) {
        return userMapper.insert(u);
    }

    @Override
    public int deleteUser(String uid) {
        return userMapper.deleteByPrimaryKey(uid);
    }
}

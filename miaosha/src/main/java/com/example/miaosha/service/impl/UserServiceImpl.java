/**
 * @Project Name:miaosha
 * @Package Name:com.example.miaosha.service.impl
 */
package com.example.miaosha.service.impl;

import com.example.miaosha.dao.UserDao;
import com.example.miaosha.domain.User;
import com.example.miaosha.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @Description:
 * @Author: ZC
 * @Email: chao_actor@163.com
 * @data: 2018/9/28 23:47
 */
@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserDao userDao;

    @Override
    public int insertUser(User user) {
        return userDao.inserUser(user);
    }

    @Override
    public int deleteUser(String uid) {
        return userDao.deleteUser(uid);
    }


}

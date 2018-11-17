/**
 * @Project Name:miaosha
 * @Package Name:com.example.miaosha.dao
 */
package com.example.miaosha.dao;

import com.example.miaosha.domain.User;

/**
 * @Description:
 * @Author: ZC
 * @Email: chao_actor@163.com
 * @data: 2018/9/28 23:42
 */
public interface UserDao {
    int inserUser(User u);

    int deleteUser(String uid);
}

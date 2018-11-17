/**
 * @Project Name:miaosha
 * @Package Name:com.example.miaosha.service
 */
package com.example.miaosha.service;

import com.example.miaosha.domain.User;

/**
 * @Description:
 * @Author: ZC
 * @Email: chao_actor@163.com
 * @data: 2018/9/28 23:46
 */
public interface UserService {
    int insertUser(User user);

    int deleteUser(String uid);
}

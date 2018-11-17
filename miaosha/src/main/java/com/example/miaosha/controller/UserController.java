/**
 * @Project Name:miaosha
 * @Package Name:com.example.miaosha.controller
 */
package com.example.miaosha.controller;

import com.example.miaosha.domain.User;
import com.example.miaosha.service.UserService;
import org.apache.commons.codec.digest.DigestUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

/**
 * @Description:
 * @Author: ZC
 * @Email: chao_actor@163.com
 * @data: 2018/11/17 14:03
 */
@Controller
@RequestMapping("/userController")
public class UserController {
    @Autowired
    private UserService userService;

    @RequestMapping("/userpager")
    private String toviewUserPage(){
        return "userModel/userPage";
    }

    /**
     *@Description: 添加用户
     *@Author: ZC
     *@Email: chao_actor@163.com
     *@TIME： 2018/11/17 14:42
     *@Params: [user]
     *@ReturnType: java.util.Map
     */
    @ResponseBody
    @RequestMapping("/adduser")
    public Map addUser(User user){
        HashMap<String, Object> map = new HashMap<>();
        user.setUserId(UUID.randomUUID().toString().replace("-",""));
//        user.setPassword(DigestUtils.md5Hex(user.getPassword())); //后台md5加密
        int i = userService.insertUser(user);
        map.put("success_row",i);
        return map;
    }
}

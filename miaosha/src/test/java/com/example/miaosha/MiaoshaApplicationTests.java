package com.example.miaosha;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.core.ValueOperations;
import org.springframework.test.context.junit4.SpringRunner;


@RunWith(SpringRunner.class)
@SpringBootTest
public class MiaoshaApplicationTests {
    @Autowired
    private RedisTemplate<String,String> redisTemplate;

    @Test
    public void testRedisTemplateSetValue(){
        ValueOperations<String, String> opsForValue = redisTemplate.opsForValue();
        opsForValue.set("name","alibaba");
        System.out.println("数据保存成功！");
    }

    @Test
    public void testRedisTemplateGetValue(){
        ValueOperations<String, String> opsForValue = redisTemplate.opsForValue();
        System.out.println("查询结果：" + opsForValue.get("name"));
    }

}

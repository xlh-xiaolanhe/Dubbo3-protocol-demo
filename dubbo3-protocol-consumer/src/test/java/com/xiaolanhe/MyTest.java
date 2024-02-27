package com.xiaolanhe;

import com.xiaolanhe.service.UserService;
import org.apache.dubbo.config.annotation.DubboReference;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

/**
 *@author: xiaolanhe
 *@createDate: 2024/2/27 22:49
 */

@SpringBootTest
public class MyTest {

    @DubboReference
    private UserService userService;

    @Test
    public void test01()
    {
        boolean res = userService.login("xiaolanhe", "123456");
        System.out.println("result: " + res);
    }
}

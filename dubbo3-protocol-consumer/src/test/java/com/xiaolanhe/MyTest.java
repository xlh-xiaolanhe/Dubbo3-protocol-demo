package com.xiaolanhe;

import com.xiaolanhe.entity.Order;
import com.xiaolanhe.service.OrderService;
import com.xiaolanhe.service.UserService;
import org.apache.dubbo.config.annotation.DubboReference;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.jar.Pack200;

/**
 *@author: xiaolanhe
 *@createDate: 2024/2/27 22:49
 */

@SpringBootTest
public class MyTest {

    /*@DubboReference
    private UserService userService;*/

    @DubboReference(protocol = "rest")
    private OrderService orderService;

    @Test
    public void test01()
    {
        /*boolean res = userService.login("xiaolanhe", "123456");
        System.out.println("result: " + res);*/
    }

    @Test
    public void testRestProtocol(){
        Order order = orderService.getOrder(100L);
        System.out.println("order = " + order);
    }
}

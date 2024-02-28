package com.xiaolanhe.service;/**
 * @Package com.xiaolanhe.service
 * @author xiaolanhe
 * @date 2024/2/28 0:00
 * @version V1.0
 */

import com.xiaolanhe.entity.Order;
import org.apache.dubbo.config.annotation.DubboService;

/**
 *@author: xiaolanhe
 *@createDate: 2024/2/28 0:00
 */

@DubboService
public class OrderServiceImpl implements OrderService{
    @Override
    public Order getOrder(Long id) {
        System.out.println("OrderServiceImpl.getOrder id " + id);
        return new Order("123456", 100.0);
    }
}

package com.xiaolanhe.service;

import org.apache.dubbo.config.annotation.DubboService;

/**
 *@author: xiaolanhe
 *@createDate: 2024/2/27 22:34
 */

@DubboService
public class UserServiceImpl implements UserService{

    @Override
    public boolean login(String userName, String password) {
        System.out.println("UserServiceImpl.login name " + userName + " password " + password);
        return false;
    }
}

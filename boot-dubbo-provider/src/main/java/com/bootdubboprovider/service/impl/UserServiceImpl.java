package com.bootdubboprovider.service.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.bootdubbocommon.service.UserService;

//timeout5秒后未响应抛出异常
//retries重试次数3，不包含第一次，实际次数为4
//version版本号
@Service(timeout = 5000,retries = 3,version = "1.0.0")
public class UserServiceImpl implements UserService {
    @Override
    public String hollo(String name) {
        return "123"+name;
    }
}

package com.bootdubboconsumer.contrllor;

import com.alibaba.dubbo.config.annotation.Reference;
import com.bootdubbocommon.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class UserContrllor {
    @Reference(version = "")
    private UserService user;
    @RequestMapping("/ho")
    @ResponseBody
    public Object hollo(){
        String name=user.hollo("张三");
        return  name;
    }
}

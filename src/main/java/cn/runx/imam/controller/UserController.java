package cn.runx.imam.controller;

import cn.runx.imam.mapper.UserMapper;
import cn.runx.imam.po.User;
import cn.runx.imam.po.UserExample;
import cn.runx.imam.redis.RedisUtil;
import cn.runx.imam.service.UserService;
import cn.runx.imam.util.RetMessageUtil;
import cn.runx.imam.util.enumMessage.LoginEnum;
import org.apache.shiro.SecurityUtils;
import org.apache.shiro.subject.Subject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/**
 * @Author: IngRun
 * @CreateTime: 2019-05-03 13:27
 * @Description:
 */

@RestController
public class UserController {

    @Autowired
    UserService userService;

    @Autowired
    RedisUtil redisUtil;

    //处理登陆请求的api
    @PostMapping("api/login")
    public Map login(String name, String password,boolean rememberMe){
        return userService.isNameAndPassword(name,password,rememberMe);
    }

    @PostMapping("api/logout")
    public Map logout(){
        Subject subject = SecurityUtils.getSubject();
        Map map = null;
        try {
            subject.logout();
            map = RetMessageUtil.getRetMessage(LoginEnum.LOGOUT_SUCCESS.getCode(),LoginEnum.LOGOUT_SUCCESS.getMessage(),"");
        } catch (Exception e) {
            map =  RetMessageUtil.getRetMessage(LoginEnum.LOGOUT_ERROR.getCode(),LoginEnum.LOGOUT_ERROR.getMessage(),"");
        }
        return map;
    }

    @PostMapping("api/getUserName")
    public Map getUserName(){
        Subject subject = SecurityUtils.getSubject();

        //该处的数据是Realm的传递过来的
        String userName = (String) subject.getPrincipal();
        return RetMessageUtil.getRetMessage(LoginEnum.LOGIN_GET_USER_NAME.getCode(),LoginEnum.LOGIN_GET_USER_NAME.getMessage(),userName);
    }

}

package cn.runx.imam.service.serviceImpl;

import cn.runx.imam.mapper.UserMapper;
import cn.runx.imam.po.User;
import cn.runx.imam.po.UserExample;
import cn.runx.imam.redis.RedisUtil;
import cn.runx.imam.service.UserService;
import cn.runx.imam.util.RetMessageUtil;
import cn.runx.imam.util.enumMessage.LoginEnum;
import jdk.nashorn.internal.parser.Token;
import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.AuthenticationException;
import org.apache.shiro.authc.UsernamePasswordToken;
import org.apache.shiro.mgt.SecurityManager;
import org.apache.shiro.subject.Subject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/**
 * @Author: IngRun
 * @CreateTime: 2019-05-03 20:19
 * @Description:
 */

@Service("UserService")
public class UserServiceImpl implements UserService {

    //用户登录服务  用来处理用户登录逻辑  传入用户名和密码  传出登录成功或者是失败的信息map
    @Override
    public Map isNameAndPassword(String name, String password,boolean rememberMe) {
        Map<String, Object> map = null;
        Subject subect = SecurityUtils.getSubject();   //获取Subject

        //设置用户信息token
        UsernamePasswordToken usernamePasswordToken = new UsernamePasswordToken(name, password);
        usernamePasswordToken.setRememberMe(rememberMe);  //设置是否记住登录
        try {
            subect.login(usernamePasswordToken);  //该处若是捕获错误代表用户登录失败

            //登录成功提示
            map = RetMessageUtil.getRetMessage(LoginEnum.LOGIN_SUCCESS.getCode(), LoginEnum.LOGIN_SUCCESS.getMessage(), name);
        } catch (AuthenticationException e) {
            //登录失败提示
            map = RetMessageUtil.getRetMessage(LoginEnum.LOGIN_FAILED.getCode(), LoginEnum.LOGIN_FAILED.getMessage(), "");
        }
        return map;
    }
}

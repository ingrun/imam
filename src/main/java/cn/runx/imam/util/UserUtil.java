package cn.runx.imam.util;

import cn.runx.imam.mapper.UserMapper;
import cn.runx.imam.po.CodeExample;
import cn.runx.imam.po.User;
import cn.runx.imam.po.UserExample;
import org.apache.shiro.SecurityUtils;
import org.apache.shiro.subject.Subject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Author: IngRun
 * @CreateTime: 2019-06-11 18:06
 * @Description: 根据用户名查找用户ID
 */

@Component
public class UserUtil {

    @Autowired
    UserMapper userMapper;

    public int findUserIdByUserName( ){
        Subject subject = SecurityUtils.getSubject();
        String userName = (String) subject.getPrincipal();
        UserExample userExample = new UserExample();
        userExample.or().andNameEqualTo(userName);
        List<User> users = userMapper.selectByExample(userExample);
        return users.get(0).getId();
    }

}

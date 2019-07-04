package cn.runx.imam.shiro;

import cn.runx.imam.mapper.UserMapper;
import cn.runx.imam.po.User;
import cn.runx.imam.po.UserExample;
import cn.runx.imam.redis.RedisUtil;
import cn.runx.imam.service.UserService;
import org.apache.shiro.authc.AuthenticationException;
import org.apache.shiro.authc.AuthenticationInfo;
import org.apache.shiro.authc.AuthenticationToken;
import org.apache.shiro.authc.SimpleAuthenticationInfo;
import org.apache.shiro.authz.AuthorizationInfo;
import org.apache.shiro.authz.SimpleAuthorizationInfo;
import org.apache.shiro.realm.AuthorizingRealm;
import org.apache.shiro.subject.PrincipalCollection;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

//实现AuthorizingRealm接口用户用户认证
public class MyShiroRealm extends AuthorizingRealm {

    //用于用户查询
    @Autowired
    private UserMapper userMapper;

    @Autowired
    RedisUtil redisUtil;

    //角色权限
    @Override
    protected AuthorizationInfo doGetAuthorizationInfo(PrincipalCollection principalCollection) {
        String name= (String) principalCollection.getPrimaryPrincipal();
        SimpleAuthorizationInfo simpleAuthorizationInfo = new SimpleAuthorizationInfo();
        return null;
    }

    //用户认证
    @Override
    protected AuthenticationInfo doGetAuthenticationInfo(AuthenticationToken authenticationToken) throws AuthenticationException {
        //加这一步的目的是在Post请求的时候会先进认证，然后在到请求
        if (authenticationToken.getPrincipal() == null) {
            return null;
        }
        String userName = authenticationToken.getPrincipal().toString();
        UserExample userExample = new UserExample();
        userExample.or().andNameEqualTo(userName);
        List<User> users = userMapper.selectByExample(userExample);
        User user = null;
        if (users!=null){
            user = users.get(0);   //取该用户列表中的第一个用户
            redisUtil.set(user.getName(),user);
            //该处第一个参数如果填User对象会导致remenmberMe功能失效
            return new SimpleAuthenticationInfo(user.getName(), user.getPassword(), getName());
        }
        return null;

    }
}
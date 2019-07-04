package cn.runx.imam.service;

import java.util.Map;

/**
 * @Author: IngRun
 * @CreateTime: 2019-05-03 20:12
 * @Description:
 */


public interface UserService {

    public Map isNameAndPassword(String name,String Password,boolean rememberMe);
}

package cn.runx.imam.controller;

import org.apache.shiro.SecurityUtils;
import org.apache.shiro.subject.Subject;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author: IngRun
 * @CreateTime: 2019-05-03 13:20
 * @Description:  测试的controller
 *
 */

@RestController
public class HelloWorld {

    @GetMapping("api/hello")
    public String Hello(){

        Subject subject = SecurityUtils.getSubject();
        String name = (String)subject.getPrincipal();

        return name;
    }

}

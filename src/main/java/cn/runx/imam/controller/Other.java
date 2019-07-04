package cn.runx.imam.controller;

import cn.runx.imam.util.RetMessageUtil;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

/**
 * @Author: IngRun
 * @CreateTime: 2019-05-06 15:31
 * @Description:
 */

@RestController
public class Other {

    @GetMapping("api/errorMessage")
    public Map errorMessage(){
        return RetMessageUtil.getRetMessage(-1,"没有权限","");
    }


}

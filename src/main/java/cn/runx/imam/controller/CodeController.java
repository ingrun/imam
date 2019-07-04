package cn.runx.imam.controller;

import cn.runx.imam.mapper.CodeMapper;
import cn.runx.imam.po.Code;
import cn.runx.imam.service.CodeService;
import org.apache.shiro.SecurityUtils;
import org.apache.shiro.subject.Subject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

/**
 * @Author: IngRun
 * @CreateTime: 2019-05-26 21:53
 * @Description: 用户密码信息控制器
 */

@RestController
public class CodeController {

    @Autowired
    CodeService codeService;

    @GetMapping("api/findCodeInfoById")
    public Map findCodeInfoById(int id){
        return codeService.findCodeInfoById(id);
    }

    @PostMapping("api/addCodeInfo")
    public Map addCodeInfo(Code code){
        return codeService.addCodeInfo(code);
    }

    //查找前10密码信息
    @GetMapping("api/findCodeTop10")
    public Map findCodeTop10(){
        return codeService.findCodeTop10();
    }

    //查找所有的密码信息   、初始化侧边栏
    @GetMapping("api/findCode")
    public Map findCode(){


        return codeService.findCode();
    }

    //查找所有的密码信息   、初始化侧边栏
    @GetMapping("api/delCode")
    public Map delCode(int id){
        return codeService.delCode(id);
    }

}

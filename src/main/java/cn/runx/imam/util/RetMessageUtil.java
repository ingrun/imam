package cn.runx.imam.util;

import com.sun.org.apache.bcel.internal.classfile.Code;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/**
 * @Author: IngRun
 * @CreateTime: 2019-05-06 14:52
 * @Description: 返回数据的格式设置类
 */

public class  RetMessageUtil {
    public static Map getRetMessage(int code,String message,Object data){
        Map<String,Object> map = new ConcurrentHashMap<>();
        map.put("Code",code);
        map.put("Message",message);
        map.put("Data",data);
        return map;
    }
}

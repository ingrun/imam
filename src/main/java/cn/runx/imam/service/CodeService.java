package cn.runx.imam.service;

import cn.runx.imam.po.Code;

import javax.swing.undo.CompoundEdit;
import java.util.Map;

/**
 * @Author: IngRun
 * @CreateTime: 2019-05-26 21:58
 * @Description: 用户密码信息服务类
 */


public interface CodeService {


    public Map findCodeInfoById(int id);

    public Map addCodeInfo(Code code);

    public Map findCodeTop10();

    public Map delCode(int id);

    public Map findCode();

}

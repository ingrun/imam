package cn.runx.imam.service.serviceImpl;

import cn.runx.imam.mapper.CodeMapper;
import cn.runx.imam.mapper.UserMapper;
import cn.runx.imam.po.Code;
import cn.runx.imam.po.CodeExample;
import cn.runx.imam.po.User;
import cn.runx.imam.po.UserExample;
import cn.runx.imam.service.CodeService;
import cn.runx.imam.util.RetMessageUtil;
import cn.runx.imam.util.UserUtil;
import cn.runx.imam.util.enumMessage.CodeEnum;
import com.github.pagehelper.PageHelper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/**
 * @Author: IngRun
 * @CreateTime: 2019-05-26 22:00
 * @Description:
 */

@Service
public class CodeServiceImpl implements CodeService {

    @Autowired
    CodeMapper codeMapper;

    @Autowired
    UserMapper userMapper;

    @Autowired
    UserUtil userUtil;


    @Override
    public Map findCodeInfoById(int id) {
        Code code = codeMapper.selectByPrimaryKey(id);
        Map map = RetMessageUtil.getRetMessage(CodeEnum.GET_CODEINFO_SUCCESS.getCode(),CodeEnum.GET_CODEINFO_SUCCESS.getMessage(),code);
        return map;
    }

    @Override
    public Map addCodeInfo(Code code) {
        int userId = userUtil.findUserIdByUserName();
        code.setUserid(userId);
        int retCode =  codeMapper.insert(code);
        if (retCode==1) {
            return RetMessageUtil.getRetMessage(CodeEnum.ADD_CODEINFO_SUCCESS.getCode(),CodeEnum.ADD_CODEINFO_SUCCESS.getMessage(),"");
        }
        return RetMessageUtil.getRetMessage(CodeEnum.ADD_CODEINFO_ERROR.getCode(),CodeEnum.ADD_CODEINFO_ERROR.getMessage(),"");
    }

    @Override
    public Map findCodeTop10() {
        PageHelper.startPage(1,10);
        List<Code> codes = codeMapper.selectByExample(new CodeExample());
        return RetMessageUtil.getRetMessage(1,"查询前十条数据成功！",codes);
    }


    @Override
    public Map delCode(int id) {
        Map map = null;
        int i =  codeMapper.deleteByPrimaryKey(id);
        if (i == 1){
            map = RetMessageUtil.getRetMessage(CodeEnum.DEL_CODEINFO_SUCCESS.getCode(),
                    CodeEnum.DEL_CODEINFO_SUCCESS.getMessage(),"");
        }else {
            map = RetMessageUtil.getRetMessage(CodeEnum.DEL_CODEINFO_ERROR.getCode(),
                    CodeEnum.DEL_CODEINFO_ERROR.getMessage(),"");
        }
        return map;
    }

    @Override
    public Map findCode() {   //密码列表项
        Map map = null;

        CodeExample codeExample = new CodeExample();
        codeExample.or().andUseridEqualTo(userUtil.findUserIdByUserName());
        List<Code> codes = codeMapper.selectByExample(codeExample);

        if (codes != null){  //查询数据成功并将数据进行返回
            List<Code> codeList = new ArrayList();
            for (int i = 0; i < codes.size() ; i++) {
                Code codes1 = codes.get(i);
                codes1.setCodepassword("");  //处理数据  ，将密码从数据中剔除
                codeList.add(codes1);
            }
            map = RetMessageUtil.getRetMessage(CodeEnum.GET_CODEINFO_SUCCESS.getCode(),
                    CodeEnum.GET_CODEINFO_SUCCESS.getMessage(),codeList);
        }else{
            map = RetMessageUtil.getRetMessage(CodeEnum.GET_CODEINFO_ERROR.getCode(),
                    CodeEnum.GET_CODEINFO_ERROR.getMessage(),codes);
        }
        return map;
    }



}

package cn.runx.imam.shiro;

import cn.runx.imam.util.RetMessageUtil;
import cn.runx.imam.util.enumMessage.LoginEnum;
import com.alibaba.druid.support.json.JSONUtils;
import org.apache.shiro.SecurityUtils;
import org.apache.shiro.subject.Subject;
import org.apache.shiro.web.filter.authc.FormAuthenticationFilter;

import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.Map;

/**
 * @Author: IngRun
 * @CreateTime: 2019-05-06 18:53
 * @Description:  自定义的shirofilter
 */


//自定义的shirofilter
public class myFormAuthenticationFilter extends FormAuthenticationFilter {

    @Override    //非法访问处理
    protected boolean onAccessDenied(ServletRequest request, ServletResponse response) throws IOException {
        HttpServletResponse httpServletResponse = (HttpServletResponse) response;

        //设置shiro 在拦截非法访问时 不重置到登陆页  而是返回错误信息
        httpServletResponse.setCharacterEncoding("UTF-8");
        httpServletResponse.setContentType("application/json");
        Map map = RetMessageUtil.getRetMessage(LoginEnum.RE_LOGIN.getCode(),LoginEnum.RE_LOGIN.getMessage(),"");
        String s = JSONUtils.toJSONString(map);
        httpServletResponse.getWriter().write(s);

        return Boolean.FALSE;
    }


    @Override   //访问验证
    protected boolean isAccessAllowed(ServletRequest request, ServletResponse response, Object mappedValue) {
        Subject subject = getSubject(request, response);
        //当前用户是否已经登录或者是使用了rememberMe;
        return subject.isAuthenticated()||subject.isRemembered();
    }
}

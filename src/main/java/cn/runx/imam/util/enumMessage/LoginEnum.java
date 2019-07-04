package cn.runx.imam.util.enumMessage;

/**
 * @Author: IngRun
 * @CreateTime: 2019-05-06 19:53
 * @Description:  登录信息的枚举类
 */

public enum  LoginEnum {
    LOGIN_SUCCESS(1,"登录成功"),
    LOGIN_FAILED(-1,"用户名或密码不正确"),
    LOGIN_GET_USER_NAME(1,"获取用户名成功"),
    LOGOUT_SUCCESS(1,"注销用户成功"),
    LOGOUT_ERROR(-1,"用户已退出"),
    RE_LOGIN(-1,"登陆已失效");
    private final int code;
    private final String message;
    private LoginEnum(int code,String message ){
        this.message = message;
        this.code = code;
    }

    public int getCode() {
        return code;
    }

    public String getMessage() {
        return message;
    }}

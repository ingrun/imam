package cn.runx.imam.util.enumMessage;

/**
 * @Author: IngRun
 * @CreateTime: 2019-05-26 23:07
 * @Description: 用户密码信息的枚举类
 */

public enum  CodeEnum {
    ADD_CODEINFO_SUCCESS(1,"添加密码成功"),
    ADD_CODEINFO_ERROR(-1,"添加密码失败"),
    GET_CODEINFO_ERROR(-1,"获取密码失败"),
    GET_CODEINFO_SUCCESS(1,"获取密码成功"),
    DEL_CODEINFO_ERROR(-1,"删除密码失败"),
    DEL_CODEINFO_SUCCESS(1,"删除密码成功");
    private final int code;
    private final String message;

    private CodeEnum(int code,String message ){
        this.message = message;
        this.code = code;
    }
    public int getCode() {
        return code;
    }

    public String getMessage() {
        return message;
    }

}

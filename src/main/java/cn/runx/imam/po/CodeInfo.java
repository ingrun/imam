package cn.runx.imam.po;

/**
 * @Author: IngRun
 * @CreateTime: 2019-05-26 21:10
 * @Description: 用来保存用户密码的实体类
 */

public class CodeInfo {

    private int id;
    private String codeDescription;  //密码描述
    private String codeUrl;
    private String codeName;
    private String codePassword;
    private String codeHint; //提示

    @Override
    public String toString() {
        return "CodeInfo{" +
                "id=" + id +
                ", codeDescription='" + codeDescription + '\'' +
                ", codeUrl='" + codeUrl + '\'' +
                ", codeName='" + codeName + '\'' +
                ", codePassword='" + codePassword + '\'' +
                ", codeHint='" + codeHint + '\'' +
                '}';
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCodeDescription() {
        return codeDescription;
    }

    public void setCodeDescription(String codeDescription) {
        this.codeDescription = codeDescription;
    }

    public String getCodeUrl() {
        return codeUrl;
    }

    public void setCodeUrl(String codeUrl) {
        this.codeUrl = codeUrl;
    }

    public String getCodeName() {
        return codeName;
    }

    public void setCodeName(String codeName) {
        this.codeName = codeName;
    }

    public String getCodePassword() {
        return codePassword;
    }

    public void setCodePassword(String codePassword) {
        this.codePassword = codePassword;
    }

    public String getCodeHint() {
        return codeHint;
    }

    public void setCodeHint(String codeHint) {
        this.codeHint = codeHint;
    }
}

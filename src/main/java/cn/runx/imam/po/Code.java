package cn.runx.imam.po;

public class Code {
    private Integer id;

    private String codedescription;

    private String codeurl;

    private String codename;

    private String codepassword;

    private String codehint;

    private Integer userid;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getCodedescription() {
        return codedescription;
    }

    public void setCodedescription(String codedescription) {
        this.codedescription = codedescription == null ? null : codedescription.trim();
    }

    public String getCodeurl() {
        return codeurl;
    }

    public void setCodeurl(String codeurl) {
        this.codeurl = codeurl == null ? null : codeurl.trim();
    }

    public String getCodename() {
        return codename;
    }

    public void setCodename(String codename) {
        this.codename = codename == null ? null : codename.trim();
    }

    public String getCodepassword() {
        return codepassword;
    }

    public void setCodepassword(String codepassword) {
        this.codepassword = codepassword == null ? null : codepassword.trim();
    }

    public String getCodehint() {
        return codehint;
    }

    public void setCodehint(String codehint) {
        this.codehint = codehint == null ? null : codehint.trim();
    }

    public Integer getUserid() {
        return userid;
    }

    public void setUserid(Integer userid) {
        this.userid = userid;
    }
}
package com.mvc.basic.entity;

import com.mvc.modules.core.extend.ChineseName;
import com.mvc.modules.core.extend.NotLogged;
import com.mvc.modules.core.extend.Property;
import com.mvc.modules.core.extend.codebuilder.TableSchemaSqlBuilder;
import com.mvc.modules.core.model.BaseIncrementIdModel;

/**
 * Created by guoyibin on 7/25/14.
 *
 *
 * 用户
 */
@ChineseName("后台用户")
@NotLogged
public class User extends BaseIncrementIdModel {

    private String userName;//管理员名称
    private String password;//密码
    private String trueName;//真是姓名
    private String email;//邮件
    private String phone;//电话
    private String registerDate;//注册日期
    private String comments;//备注



    @Property(chineseName="用户名")
    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    @Property(chineseName="密码")
    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Property(chineseName="真实姓名")
    public String getTrueName() {
        return trueName;
    }

    public void setTrueName(String trueName) {
        this.trueName = trueName;
    }

    @Property(chineseName="邮箱")
    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Property(chineseName="手机号")
    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    @Property(chineseName="注册日期")
    public String getRegisterDate() {
        return registerDate;
    }

    public void setRegisterDate(String registerDate) {
        this.registerDate = registerDate;
    }

    @Property(chineseName="备注")
    public String getComments() {
        return comments;
    }

    public void setComments(String comments) {
        this.comments = comments;
    }



    /**
     * 生成SQL语句
     * */
    public static void main(String[] args) {
        System.out.println( new TableSchemaSqlBuilder().setPrefix("mvc").buildByClass(User.class));
    }
}

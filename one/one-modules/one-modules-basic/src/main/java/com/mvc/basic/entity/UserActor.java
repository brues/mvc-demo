package com.mvc.basic.entity;

import com.mvc.modules.core.extend.ChineseName;
import com.mvc.modules.core.extend.NotLogged;
import com.mvc.modules.core.extend.Property;
import com.mvc.modules.core.extend.codebuilder.TableSchemaSqlBuilder;
import com.mvc.modules.core.model.BaseIncrementIdModel;

/**
 * Created by guoyibin on 7/25/14.
 *
 * 用户角色
 */
@ChineseName("用户角色")
@NotLogged
public class UserActor extends BaseIncrementIdModel {

    private Integer userId;//管理员ID
    private Integer actorId;//角色ID
    private String actorName;//角色名称

    @Property(chineseName="用户id")
    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    @Property(chineseName="角色id")
    public Integer getActorId() {
        return actorId;
    }

    public void setActorId(Integer actorId) {
        this.actorId = actorId;
    }

    @Property(chineseName="用户的角色名称")
    public String getActorName() {
        return actorName;
    }

    public void setActorName(String actorName) {
        this.actorName = actorName;
    }

    /**
     * 生成SQL语句
     * */
    public static void main(String[] args) {
        System.out.println( new TableSchemaSqlBuilder().setPrefix("mvc").buildByClass(UserActor.class));
    }
}

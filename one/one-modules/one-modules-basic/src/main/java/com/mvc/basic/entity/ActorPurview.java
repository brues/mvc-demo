package com.mvc.basic.entity;

import com.mvc.modules.core.extend.ChineseName;
import com.mvc.modules.core.extend.NotLogged;
import com.mvc.modules.core.extend.Property;
import com.mvc.modules.core.extend.codebuilder.TableSchemaSqlBuilder;
import com.mvc.modules.core.model.BaseIncrementIdModel;

/**
 * Created by guoyibin on 7/25/14.
 *
 * 角色权限
 */
@ChineseName("角色权限")
@NotLogged
public class ActorPurview extends BaseIncrementIdModel {

    private Integer actorId;//角色ID
    private Integer purviewId;//权限ID

    @Property(chineseName="角色id")
    public Integer getActorId() {
        return actorId;
    }

    public void setActorId(Integer actorId) {
        this.actorId = actorId;
    }


    @Property(chineseName="权限id")
    public Integer getPurviewId() {
        return purviewId;
    }

    public void setPurviewId(Integer purviewId) {
        this.purviewId = purviewId;
    }

    /**
     * 生成SQL语句
     * */
    public static void main(String[] args) {
        System.out.println( new TableSchemaSqlBuilder().setPrefix("mvc").buildByClass(ActorPurview.class));
    }
}

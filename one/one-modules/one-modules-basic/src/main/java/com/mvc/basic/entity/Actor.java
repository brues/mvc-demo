package com.mvc.basic.entity;

import com.mvc.modules.core.extend.ChineseName;
import com.mvc.modules.core.extend.NotLogged;
import com.mvc.modules.core.extend.Property;
import com.mvc.modules.core.extend.codebuilder.TableSchemaSqlBuilder;
import com.mvc.modules.core.model.BaseIncrementIdModel;

/**
 * Created by guoyibin on 7/25/14.
 *
 * 角色
 */
@ChineseName("角色")
@NotLogged
public class Actor extends BaseIncrementIdModel {
    private String actorName;


    @Property(chineseName="角色名")
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
        System.out.println( new TableSchemaSqlBuilder().setPrefix("mvc").buildByClass(Actor.class));
    }
}

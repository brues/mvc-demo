package com.mvc.basic.entity;

import com.mvc.modules.core.extend.ChineseName;
import com.mvc.modules.core.extend.NotLogged;
import com.mvc.modules.core.extend.Property;
import com.mvc.modules.core.extend.codebuilder.TableSchemaSqlBuilder;
import com.mvc.modules.core.model.BaseIncrementIdModel;

/**
 * Created by guoyibin on 7/25/14.
 *
 * 权限
 */
@ChineseName("权限")
@NotLogged
public class Purview extends BaseIncrementIdModel {

    private String purviewName;//权限名称
    private Integer parentId;//父ID
    private String url;//路径
    private String isLeaf;


    @Property(chineseName="权限名称")
    public String getPurviewName() {
        return purviewName;
    }

    public void setPurviewName(String purviewName) {
        this.purviewName = purviewName;
    }

    @Property(chineseName="父权限id")
    public Integer getParentId() {
        return parentId;
    }

    public void setParentId(Integer parentId) {
        this.parentId = parentId;
    }

    @Property(chineseName="链接地址")
    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    @Property(chineseName="是否为叶子节点  1：是     0：否")
    public String getIsLeaf() {
        return isLeaf;
    }

    public void setIsLeaf(String isLeaf) {
        this.isLeaf = isLeaf;
    }



    /**
     * 生成SQL语句
     * */
    public static void main(String[] args) {
        System.out.println( new TableSchemaSqlBuilder().setPrefix("mvc").buildByClass(Purview.class));
    }
}

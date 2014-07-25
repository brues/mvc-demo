package com.mvc.basic.dao;

import com.mvc.basic.entity.Purview;
import com.mvc.modules.core.BaseDao;
import com.mvc.modules.core.annotation.MyBatisRepository;

import java.util.List;

/**
 * Created by guoyibin on 7/25/14.
 */
@MyBatisRepository
public interface PurviewDao extends BaseDao<Purview> {

    //根据父id查询列表
    public List<Purview> findByParentId(Long parentId);
}

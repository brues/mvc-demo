package com.mvc.basic.dao;

import com.mvc.basic.entity.Actor;
import com.mvc.modules.core.BaseDao;
import com.mvc.modules.core.annotation.MyBatisRepository;

/**
 * Created by guoyibin on 7/25/14.
 */
@MyBatisRepository
public interface ActorDao extends BaseDao<Actor> {
}

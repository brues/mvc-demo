package com.mvc.basic.biz;

import com.mvc.basic.dao.ActorDao;
import com.mvc.basic.entity.Actor;
import com.mvc.modules.core.BaseBiz;
import org.springframework.stereotype.Service;

/**
 * Created by guoyibin on 7/25/14.
 */
@Service
public class ActorBiz extends BaseBiz<Actor, ActorDao> {
}

package com.mvc.basic.biz;

import com.mvc.basic.dao.UserDao;
import com.mvc.basic.entity.User;
import com.mvc.modules.core.BaseBiz;
import org.springframework.stereotype.Service;

/**
 * Created by guoyibin on 7/25/14.
 */
@Service
public class UserBiz extends BaseBiz<User, UserDao> {
}

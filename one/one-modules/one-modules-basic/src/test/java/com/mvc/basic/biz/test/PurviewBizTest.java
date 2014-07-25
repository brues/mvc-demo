package com.mvc.basic.biz.test;

import com.mvc.basic.biz.PurviewBiz;
import com.mvc.modules.test.spring.Profiles;
import com.mvc.modules.test.spring.SpringTransactionalTestCase;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.annotation.DirtiesContext;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.transaction.TransactionConfiguration;

/**
 * Created by guoyibin on 7/25/14.
 *
 */
@DirtiesContext
@ContextConfiguration(locations = { "/applicationContext.xml" })
@ActiveProfiles(Profiles.DEVELOPMENT)
@TransactionConfiguration(defaultRollback=false)
public class PurviewBizTest extends SpringTransactionalTestCase {

    @Autowired
    private PurviewBiz purviewBiz;

    /**
     * 根据父id查询列表功能测试
     * */
    @Test
    public void findByParentIdTest() throws Exception {
        purviewBiz.findByParentId(10L);
    }
}

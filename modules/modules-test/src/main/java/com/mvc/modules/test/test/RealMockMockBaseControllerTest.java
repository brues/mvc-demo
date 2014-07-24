package com.mvc.modules.test.test;

import org.junit.Before;
import org.mockito.MockitoAnnotations;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.transaction.TransactionConfiguration;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.springframework.web.context.WebApplicationContext;

/**
 * Created with IntelliJ IDEA.
 * User: basil
 * Date: 13-12-1
 * Time: 15:52
 * <p/>
 * 真实控制器功能测试，可插入数据操控Service层
 */
@TransactionConfiguration(defaultRollback = false)
public class RealMockMockBaseControllerTest extends MockBaseControllerTest {

    @Autowired
    private WebApplicationContext wac;

    @Before
    public void before() throws Exception {
        MockitoAnnotations.initMocks(this); // 初始化mock对象
        this.mockMvc = MockMvcBuilders.webAppContextSetup(this.wac).build();

    }

}

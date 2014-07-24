package com.mvc.modules.test.test;

import com.mvc.modules.test.spring.Profiles;
import com.mvc.modules.test.spring.SpringTransactionalTestCase;
import org.junit.Before;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.test.web.servlet.MockMvc;

/**
 * Created with IntelliJ IDEA.
 * User: basil
 * Date: 13-11-30
 * Time: 14:50
 */

@WebAppConfiguration
@ContextConfiguration(locations = {
        "classpath*:/applicationContext.xml",
        "classpath*:/web/spring-mvc.xml"
})
@ActiveProfiles(Profiles.DEVELOPMENT)
public abstract class MockBaseControllerTest extends SpringTransactionalTestCase {
    protected MockMvc mockMvc;

    @Before
    public abstract void before() throws Exception;
}

package com.mvc.modules.test.test;


import org.springframework.test.web.servlet.setup.StandaloneMockMvcBuilder;
import org.springframework.web.accept.ContentNegotiationManagerFactoryBean;

/**
 * Created with IntelliJ IDEA.
 * User: basil
 * Date: 13-11-29
 * Time: 8:35
 * 一个favorPathExtension=false的StandaloneMockMvcBuilder
 */
public class StandaloneMockMvcBuilderWithNoPathExtension extends StandaloneMockMvcBuilder {

    /**
     * 重设 ContentNegotiationManager, 关闭自动URL后缀检测
     *
     * @param controllers 控制器
     */
    protected StandaloneMockMvcBuilderWithNoPathExtension(Object... controllers) {
        super(controllers);
        ContentNegotiationManagerFactoryBean factory = new ContentNegotiationManagerFactoryBean();
        factory.setFavorPathExtension(false); // 关闭URL后缀检测
        factory.afterPropertiesSet();
        setContentNegotiationManager(factory.getObject());
    }
}
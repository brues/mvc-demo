package com.mvc.modules.test.test;

/**
 * Created with IntelliJ IDEA.
 * User: basil
 * Date: 13-11-29
 * Time: 8:34
 *
 * 重写了一个标准的MockMvcBuilders 为了将后缀检测去掉
 */
public class QMockMvcBuilders {
    public static StandaloneMockMvcBuilderWithNoPathExtension standaloneSetup(Object... controllers) {
        return new StandaloneMockMvcBuilderWithNoPathExtension(controllers);
    }
}

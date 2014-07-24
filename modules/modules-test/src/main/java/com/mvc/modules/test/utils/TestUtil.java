package com.mvc.modules.test.utils;

import com.mvc.modules.utils.idcard.IdcardInfoExtractor;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.http.MediaType;

import java.io.IOException;
import java.nio.charset.Charset;
import java.util.Iterator;
import java.util.Map;
import java.util.Random;
import java.util.Set;

/**
 * Created with IntelliJ IDEA.
 * User: basil
 * Date: 13-11-30
 * Time: 12:44
 *
 * 为单元测试使用的工具类，主要提供随机测试数据生成
 */
public class TestUtil {

    public static final MediaType APPLICATION_JSON_UTF8 = new MediaType(MediaType.APPLICATION_JSON.getType(), MediaType.APPLICATION_JSON.getSubtype(), Charset.forName("utf8"));

    public static byte[] convertObjectToJsonBytes(Object object) throws IOException {
        ObjectMapper mapper = new ObjectMapper();
        mapper.setSerializationInclusion(JsonInclude.Include.NON_NULL);
        return mapper.writeValueAsBytes(object);
    }


    private static Random random = new Random();

    /**
     * 随机数据对象提供更多的随机数据生成功能
     * @return
     */
    public static RandomData randomData(){
       return new RandomData();
    }

    /**
     * 随机生成用户名
     * @return
     */
    public static String randomName(){
        return randomData().generate(0);
    }

    /**
     * 随机生成用户邮箱
     * @return
     */
    public static String randomEmail(){
        return randomData().generate(3);
    }
    /**
     * 随机生成手机号
     * @return
     */
    public static String randomTel(){
        return randomData().generate(1);
    }

    /**
     * 随机生成QQ
     * @return
     */
    public static String randomQQ(){
        return randomData().generate(2);
    }

    /**
     * 随机生成身份证号
     * @return
     */
    public static String randomIdCard(){
        return new IdCardGenerator().generate();

    }


    /**
     * 根据身份证号从身份证中提取信息
     * @param idCard
     * @return
     */
    public static IdcardInfoExtractor infoExtractor(String idCard){
        return new IdcardInfoExtractor(idCard);
    }


    /**
     * 将对象转换为表单url编码字符串对象并将字符串对象作为一个字节数组返回.
     * @param object
     * @return
     */
    public static byte[] convertObjectToFormUrlEncodedBytes(Object object) {
        ObjectMapper mapper = new ObjectMapper();
        mapper.setSerializationInclusion(JsonInclude.Include.NON_NULL);

        Map<String, Object> propertyValues = mapper.convertValue(object, Map.class);

        Set<String> propertyNames = propertyValues.keySet();
        Iterator<String> nameIter = propertyNames.iterator();

        StringBuilder formUrlEncoded = new StringBuilder();

        for (int index=0; index < propertyNames.size(); index++) {
            String currentKey = nameIter.next();
            Object currentValue = propertyValues.get(currentKey);

            formUrlEncoded.append(currentKey);
            formUrlEncoded.append("=");
            formUrlEncoded.append(currentValue);

            if (nameIter.hasNext()) {
                formUrlEncoded.append("&");
            }
        }
        return formUrlEncoded.toString().getBytes();
    }

}

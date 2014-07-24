package com.mvc.modules.test.utils;

import java.util.Collections;
import java.util.List;
import java.util.Random;

/**
 * Created with IntelliJ IDEA.
 * User: basil
 * Date: 13-11-30
 * Time: 13:07
 */
public class RandomData {
    private static Random random = new Random();
    private static char ch[] = { '0', '1', '2', '3', '4', '5', '6', '7', '8',
            '9', 'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L',
            'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y',
            'Z', 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l',
            'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y',
            'z', '0', '1' };//最后又重复两个0和1，因为需要凑足数组长度为64
    private static final char[] eng_char = new char[]{'a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','u','v','w','x','y','z'};
    private static final String[] first_name = new String[]{"zhao","qian","sun","li","zhou","wang","wu","zheng","feng","chen","chu","wei","jiang","shen","yang"
            ,"zhu","qin","you","xu","he","shi","zhan","kong","cao","xie","jin","shu","fang","yuan"};
    private static final String[] tel_head = new String[]{"13","18","15"};
    private static final String[] email_suffix = new String[]{"@gmail.com","@yahoo.com","@msn.com","@hotmail.com","@aol.com","@ask.com"
            ,"@live.com","@qq.com","@0355.net","@163.com","@163.net","@263.net"
            ,"@3721.net","@yeah.net","@googlemail.com","@126.com","@sina.com","@sohu.com","@yahoo.com.cn"};



    public String generate(int randomType){
        StringBuilder uName = new StringBuilder();
//        int randomType = random.nextInt(Integer.MAX_VALUE)%3;
        switch (randomType) {
            case 3:
                uName.append(first_name[random.nextInt(Integer.MAX_VALUE)%first_name.length])
                        .append(eng_char[random.nextInt(Integer.MAX_VALUE)%eng_char.length]);
                uName.append(email_suffix[random.nextInt(Integer.MAX_VALUE)%email_suffix.length]);
                break;
            case 0: // firstName + randomSecName + birthday
                uName.append(first_name[random.nextInt(Integer.MAX_VALUE)%first_name.length])
                        .append(eng_char[random.nextInt(Integer.MAX_VALUE)%eng_char.length]);

                if(random.nextInt(Integer.MAX_VALUE)%2 == 0){
                    uName.append(eng_char[random.nextInt(Integer.MAX_VALUE)%eng_char.length]);
                }

                // birthday
                if(random.nextInt(Integer.MAX_VALUE)%2 == 0){
                    uName.append(String.valueOf(2014 - (random.nextInt(Integer.MAX_VALUE) % (50 - 15) + 15))); // 大于15小于50岁
                }
                if(random.nextInt(Integer.MAX_VALUE)%2 == 0){
                    int month = random.nextInt(Integer.MAX_VALUE)%11 + 1;
                    int day = random.nextInt(Integer.MAX_VALUE)%29 + 1;
                    if(month < 10)
                        uName.append("0");
                    uName.append(month);
                    if(day < 10)
                        uName.append("0");
                    uName.append(day);
                }
/*                if(random.nextInt(Integer.MAX_VALUE%4) == 0){// add email suffix , 1/4 rate
                    uName.append(email_suffix[random.nextInt(Integer.MAX_VALUE)%email_suffix.length]);
                }*/
                break;
            case 1: // tel
                uName.append(tel_head[random.nextInt(Integer.MAX_VALUE)%tel_head.length])
                        .append(random.nextInt(Integer.MAX_VALUE)%10)
                        .append(random.nextInt(Integer.MAX_VALUE)%10)
                        .append(random.nextInt(Integer.MAX_VALUE)%10)
                        .append(random.nextInt(Integer.MAX_VALUE)%10)
                        .append(random.nextInt(Integer.MAX_VALUE)%10)
                        .append(random.nextInt(Integer.MAX_VALUE)%10)
                        .append(random.nextInt(Integer.MAX_VALUE)%10)
                        .append(random.nextInt(Integer.MAX_VALUE)%10)
                        .append(random.nextInt(Integer.MAX_VALUE)%10);
                break;
            case 2: // qq
                uName.append(random.nextInt(Integer.MAX_VALUE)%9+1)
                        .append(random.nextInt(Integer.MAX_VALUE)%10)
                        .append(random.nextInt(Integer.MAX_VALUE)%10)
                        .append(random.nextInt(Integer.MAX_VALUE)%10)
                        .append(random.nextInt(Integer.MAX_VALUE)%10);
                int length = 0;
                while(random.nextInt(Integer.MAX_VALUE)%2 == 0){
                    if(length > 6)
                        break;
                    uName.append(random.nextInt(Integer.MAX_VALUE)%10);
                    length ++;
                }
                break;

            default:
                break;
        }
        return uName.toString();
    }


    /**
     * 生成指定长度的随机字符串
     * @param length
     * @return
     */
    public String createRandomString(int length) {
        if (length > 0) {
            int index = 0;
            char[] temp = new char[length];
            int num = random.nextInt();
            for (int i = 0; i < length % 5; i++) {
                temp[index++] = ch[num & 63];//取后面六位，记得对应的二进制是以补码形式存在的。
                num >>= 6;//63的二进制为:111111
            }
            for (int i = 0; i < length / 5; i++) {
                num = random.nextInt();
                for (int j = 0; j < 5; j++) {
                    temp[index++] = ch[num & 63];
                    num >>= 6;
                }
            }
            return new String(temp, 0, length);
        } else if (length == 0) {
            return "";
        } else {
            throw new IllegalArgumentException();
        }
    }



    /**
     * 返回随机ID.
     */
    public  long randomId() {
        return random.nextLong();
    }

    /**
     * 返回随机名称, prefix字符串+5位随机数字.
     */
    public String randomName(String prefix) {
        return prefix + random.nextInt(10000);
    }

    /**
     * 从输入list中随机返回一个对象.
     */
    public  <T> T randomOne(List<T> list) {
        Collections.shuffle(list);
        return list.get(0);
    }

    /**
     * 从输入list中随机返回n个对象.
     */
    public  <T> List<T> randomSome(List<T> list, int n) {
        Collections.shuffle(list);
        return list.subList(0, n);
    }

    /**
     * 从输入list中随机返回随机个对象.
     */
    public  <T> List<T> randomSome(List<T> list) {
        int size = random.nextInt(list.size());
        if (size == 0) {
            size = 1;
        }
        return randomSome(list, size);
    }


}

package com.imooc.sell;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * xuelinbing
 * 20190227
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class LoggerTest {

    private final Logger logger = LoggerFactory.getLogger(LoggerTest.class);

    @Test
    public void test1() {
        //日志打印变量
        String name = "张三";
        String password = "123456";
        logger.info("name: {},password: {}", name,password);
        logger.debug("***debuglog*******************");
        logger.info("***infolog*******************");
        logger.error("***errorlog*******************");

        Integer age = 22;
        String sex = "女";
        logger.info("age: {},  sex: {}",age,sex);



    }
}

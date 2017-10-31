package com.appinfodb.test.app_info;

import com.appinfodb.service.InfoService;
import org.apache.log4j.Logger;
import org.junit.BeforeClass;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class app_infoTest {
    Logger logger = Logger.getLogger(app_infoTest.class);
    private static final String path = "classpath:spring/applicationContext-mybatis.xml";
    private static ApplicationContext context = null;
    private static InfoService billService = null;

    @BeforeClass
    public static void before() {
        context = new ClassPathXmlApplicationContext(path);
        billService = (InfoService) context.getBean("infoService");

    }

    @Test
    public void TestSelect(){
        System.out.println(billService.getInfoById(48).toString());



    }


}

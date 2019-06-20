package com.demo2;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class DemoTest {

    @Test
    //spring事务管理--注解配置aop
    public void test(){
        ApplicationContext acx = new ClassPathXmlApplicationContext("main/com/demo2/applicationContext1.xml");
        AccountService as = (AccountService) acx.getBean("accountService");
        as.transfer(1,2,100d);
        System.out.println("success!--------");
    }
}

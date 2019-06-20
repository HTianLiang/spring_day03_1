package com.demo;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.annotation.Resource;

//@RunWith(SpringJUnit4ClassRunner.class)
//@ContextConfiguration("classpath:main/com/demo/applicationContext1.xml")
public class DemoTest {
    //@Resource(name = "accountService")
    //private AccountService as;

    @Test
    //spring操作数据库
    public void test(){
        ApplicationContext acx = new ClassPathXmlApplicationContext("main/com/demo/applicationContext.xml");
        AccountService as = (AccountService) acx.getBean("accountService");
        as.transfer(1,2,100d);
    }
}

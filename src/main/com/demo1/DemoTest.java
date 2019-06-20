package com.demo1;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.annotation.Resource;

//@RunWith(SpringJUnit4ClassRunner.class)
//@ContextConfiguration("classpath*:main/com/demo1/applicationContext1.xml")
public class DemoTest {
   // @Resource(name = "accountService")
    //private AccountService as;

    @Test
    //spring事务管理--xml配置aop
    public void test1(){
        ApplicationContext acx = new ClassPathXmlApplicationContext("main/com/demo1/applicationContext.xml");
        AccountService as = (AccountService) acx.getBean("accountService");
        as.transfer(1,2,100d);
        System.out.println("success!------------");
    }
}

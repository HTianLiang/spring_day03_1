package com.demo2;

import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

public class AccountServiceImpl implements AccountService {
    private AccountDao ad;

    @Override
    /*
    使用注解管理aop事务
    以方法为单位，指定方法应用什么事务属性
    isolation：隔离级别
    propagation：传播行为
    read-only：是否只读
    */
    @Transactional(isolation = Isolation.REPEATABLE_READ,propagation = Propagation.REQUIRED,readOnly = false)
    public void transfer(Integer from, Integer to, Double money) {
        //减钱
        ad.decreaseMoney(from,money);
        //int i =1/0;
        //加钱
        ad.increaseMoney(to,money);
    }

    public void setAd(AccountDao ad) {
        this.ad = ad;
    }
}

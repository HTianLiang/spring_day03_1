package com.demo2;

public interface AccountService {
    //转账方法
    void transfer(Integer from, Integer to, Double money);
}

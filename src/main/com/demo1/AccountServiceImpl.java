package com.demo1;

import com.demo.AccountDao;

public class AccountServiceImpl implements AccountService {
    private AccountDao ad;

    @Override
    public void transfer(Integer from, Integer to, Double money) {
        //减钱
        ad.decreaseMoney(from,money);
        //int i=1/0;
        //加钱
        ad.increaseMoney(to,money);
    }

    public void setAd(AccountDao ad) {
        this.ad = ad;
    }
}

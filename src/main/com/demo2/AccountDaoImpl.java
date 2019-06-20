package com.demo2;

import org.springframework.jdbc.core.support.JdbcDaoSupport;

public class AccountDaoImpl extends JdbcDaoSupport implements AccountDao {

    //加钱
    public void increaseMoney(Integer id, Double money) {
        String sql = "update tb_account set money = money+? where id = ?";
        getJdbcTemplate().update(sql,money,id);
    }

    //减钱
    public void decreaseMoney(Integer id, Double money) {
        String sql = "update tb_account set money = money-? where id = ?";
        getJdbcTemplate().update(sql,money,id);
    }
}

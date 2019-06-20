package com.demo1;

import com.demo.AccountDao;
import org.springframework.jdbc.core.support.JdbcDaoSupport;

public class AccountDaoImpl extends JdbcDaoSupport implements AccountDao {

    public void increaseMoney(Integer id, Double money) {
        String sql = "update tb_account set money = money+? where id = ?";
        getJdbcTemplate().update(sql,money,id);
    }

    public void decreaseMoney(Integer id, Double money) {
        String sql = "update tb_account set money = money-? where id = ?";
        getJdbcTemplate().update(sql,money,id);
    }
}

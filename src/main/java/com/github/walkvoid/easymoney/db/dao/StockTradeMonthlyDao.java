package com.github.walkvoid.easymoney.db.dao;

import com.github.walkvoid.easymoney.db.entity.StockTradeMonthly;
import com.github.walkvoid.easymoney.db.mapper.StockTradeMonthlyMapper;
import javax.annotation.Resource;
import org.springframework.stereotype.Repository;

@Repository
public class StockTradeMonthlyDao {

    @Resource
    private StockTradeMonthlyMapper stockTradeMonthlyMapper;

    public StockTradeMonthly getById(Long id) {
        return stockTradeMonthlyMapper.selectById(id);
    }

    public boolean save(StockTradeMonthly stockTradeMonthly) {
        return stockTradeMonthlyMapper.insert(stockTradeMonthly) > 0;
    }

    public boolean update(StockTradeMonthly stockTradeMonthly) {
        return stockTradeMonthlyMapper.updateById(stockTradeMonthly) > 0;
    }

    public boolean delete(Long id) {
        return stockTradeMonthlyMapper.deleteById(id) > 0;
    }
}
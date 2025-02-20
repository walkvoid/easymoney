package com.github.walkvoid.easymoney.db.dao;

import com.github.walkvoid.easymoney.db.entity.StockTradeWeekly;
import com.github.walkvoid.easymoney.db.mapper.StockTradeWeeklyMapper;
import javax.annotation.Resource;
import org.springframework.stereotype.Repository;



@Repository
public class StockTradeWeeklyDao {

    @Resource
    private StockTradeWeeklyMapper stockTradeWeeklyMapper;

    public StockTradeWeekly getById(Long id) {
        return stockTradeWeeklyMapper.selectById(id);
    }

    public boolean save(StockTradeWeekly stockTradeWeekly) {
        return stockTradeWeeklyMapper.insert(stockTradeWeekly) > 0;
    }

    public boolean update(StockTradeWeekly stockTradeWeekly) {
        return stockTradeWeeklyMapper.updateById(stockTradeWeekly) > 0;
    }

    public boolean delete(Long id) {
        return stockTradeWeeklyMapper.deleteById(id) > 0;
    }
}
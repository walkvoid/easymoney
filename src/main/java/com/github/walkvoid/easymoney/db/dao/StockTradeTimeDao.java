package com.github.walkvoid.easymoney.db.dao;

import com.github.walkvoid.easymoney.db.entity.StockTradeTime;
import com.github.walkvoid.easymoney.db.mapper.StockTradeTimeMapper;
import javax.annotation.Resource;
import org.springframework.stereotype.Repository;

@Repository
public class StockTradeTimeDao {

    @Resource
    private StockTradeTimeMapper stockTradeTimeMapper;

    public StockTradeTime getById(Long id) {
        return stockTradeTimeMapper.selectById(id);
    }

    public boolean save(StockTradeTime stockTradeTime) {
        return stockTradeTimeMapper.insert(stockTradeTime) > 0;
    }

    public boolean update(StockTradeTime stockTradeTime) {
        return stockTradeTimeMapper.updateById(stockTradeTime) > 0;
    }

    public boolean delete(Long id) {
        return stockTradeTimeMapper.deleteById(id) > 0;
    }
}
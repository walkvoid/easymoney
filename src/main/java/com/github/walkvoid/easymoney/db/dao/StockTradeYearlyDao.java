package com.github.walkvoid.easymoney.db.dao;

import com.github.walkvoid.easymoney.db.entity.StockTradeYearly;
import com.github.walkvoid.easymoney.db.mapper.StockTradeYearlyMapper;
import javax.annotation.Resource;
import org.springframework.stereotype.Repository;

@Repository
public class StockTradeYearlyDao {

    @Resource
    private StockTradeYearlyMapper stockTradeYearlyMapper;

    public StockTradeYearly getById(Long id) {
        return stockTradeYearlyMapper.selectById(id);
    }

    public boolean save(StockTradeYearly stockTradeYearly) {
        return stockTradeYearlyMapper.insert(stockTradeYearly) > 0;
    }

    public boolean update(StockTradeYearly stockTradeYearly) {
        return stockTradeYearlyMapper.updateById(stockTradeYearly) > 0;
    }

    public boolean delete(Long id) {
        return stockTradeYearlyMapper.deleteById(id) > 0;
    }
}
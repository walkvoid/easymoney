package com.github.walkvoid.easymoney.db.dao;

import com.github.walkvoid.easymoney.db.entity.StockTradeQuarterly;
import com.github.walkvoid.easymoney.db.mapper.StockTradeQuarterlyMapper;
import javax.annotation.Resource;
import org.springframework.stereotype.Repository;

@Repository
public class StockTradeQuarterlyDao {

    @Resource
    private StockTradeQuarterlyMapper stockTradeQuarterlyMapper;

    public StockTradeQuarterly getById(Long id) {
        return stockTradeQuarterlyMapper.selectById(id);
    }

    public boolean save(StockTradeQuarterly stockTradeQuarterly) {
        return stockTradeQuarterlyMapper.insert(stockTradeQuarterly) > 0;
    }

    public boolean update(StockTradeQuarterly stockTradeQuarterly) {
        return stockTradeQuarterlyMapper.updateById(stockTradeQuarterly) > 0;
    }

    public boolean delete(Long id) {
        return stockTradeQuarterlyMapper.deleteById(id) > 0;
    }
}
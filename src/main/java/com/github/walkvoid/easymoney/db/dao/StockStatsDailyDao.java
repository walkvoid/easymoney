package com.github.walkvoid.easymoney.db.dao;

import com.github.walkvoid.easymoney.db.entity.StockTradeDaily;
import com.github.walkvoid.easymoney.db.mapper.StockStatsDailyMapper;
import javax.annotation.Resource;
import org.springframework.stereotype.Repository;

@Repository
public class StockStatsDailyDao {

    @Resource
    private StockStatsDailyMapper stockStatsDailyMapper;

    public StockTradeDaily getById(Long id) {
        return stockStatsDailyMapper.selectById(id);
    }

    public boolean save(StockTradeDaily stockTradeDaily) {
        return stockStatsDailyMapper.insert(stockTradeDaily) > 0;
    }

    public boolean update(StockTradeDaily stockTradeDaily) {
        return stockStatsDailyMapper.updateById(stockTradeDaily) > 0;
    }

    public boolean delete(Long id) {
        return stockStatsDailyMapper.deleteById(id) > 0;
    }
}
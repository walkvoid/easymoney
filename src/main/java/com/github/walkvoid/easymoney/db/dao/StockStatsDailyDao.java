package com.github.walkvoid.easymoney.db.dao;

import com.github.walkvoid.easymoney.db.entity.StockStatsDaily;
import com.github.walkvoid.easymoney.db.mapper.StockStatsDailyMapper;
import javax.annotation.Resource;
import org.springframework.stereotype.Repository;

@Repository
public class StockStatsDailyDao {

    @Resource
    private StockStatsDailyMapper stockStatsDailyMapper;

    public StockStatsDaily getById(Long id) {
        return stockStatsDailyMapper.selectById(id);
    }

    public boolean save(StockStatsDaily stockStatsDaily) {
        return stockStatsDailyMapper.insert(stockStatsDaily) > 0;
    }

    public boolean update(StockStatsDaily stockStatsDaily) {
        return stockStatsDailyMapper.updateById(stockStatsDaily) > 0;
    }

    public boolean delete(Long id) {
        return stockStatsDailyMapper.deleteById(id) > 0;
    }
}
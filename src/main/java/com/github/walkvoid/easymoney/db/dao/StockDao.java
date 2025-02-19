package com.github.walkvoid.easymoney.db.dao;

import com.github.walkvoid.easymoney.db.entity.Stock;
import com.github.walkvoid.easymoney.db.mapper.StockMapper;
import javax.annotation.Resource;
import org.springframework.stereotype.Repository;

@Repository
public class StockDao {

    @Resource
    private StockMapper stockMapper;

    public Stock getById(Long id) {
        return stockMapper.selectById(id);
    }

    public boolean save(Stock stock) {
        return stockMapper.insert(stock) > 0;
    }

    public boolean update(Stock stock) {
        return stockMapper.updateById(stock) > 0;
    }

    public boolean delete(Long id) {
        return stockMapper.deleteById(id) > 0;
    }
}
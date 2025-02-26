package com.github.walkvoid.easymoney.db.dao;

import com.github.walkvoid.easymoney.db.entity.StockTradeTime;
import com.github.walkvoid.easymoney.db.mapper.StockTradeTimeMapper;
import javax.annotation.Resource;
import org.springframework.stereotype.Repository;
/**
 * @author walkvoid
 * @date 2025/2/19
 * @description: 股票交易时间DAO
 * @version:
 */
@Repository
public class StockTradeTimeDao {

    @Resource
    private StockTradeTimeMapper stockTradeTimeMapper;

    /**
     *  Get a StockTradeTime instance by the given id
     * @param id the id of StockTradeTime to retrieve
     * @return the StockTradeTime instance with the given id, or null if not found
     */
    public StockTradeTime getById(Long id) {
        return stockTradeTimeMapper.selectById(id);
    }

    /**
     * Save a StockTradeTime instance to database.
     * @param stockTradeTime the StockTradeTime instance to save
     * @return true if the save operation is successful, false if otherwise
     */
    public boolean save(StockTradeTime stockTradeTime) {
        return stockTradeTimeMapper.insert(stockTradeTime) > 0;
    }

    /**
     * Update an existing StockTradeTime instance in the database.
     */
    public boolean update(StockTradeTime stockTradeTime) {
        return stockTradeTimeMapper.updateById(stockTradeTime) > 0;
    }

    /**
     * Delete a StockTradeTime instance by the given id
     * @param id the id of StockTradeTime to delete
     * @return true if the delete operation is successful, false if otherwise
     */
    public boolean delete(Long id) {
        return stockTradeTimeMapper.deleteById(id) > 0;
    }
}
package com.github.walkvoid.easymoney.db.dao;

import com.github.walkvoid.easymoney.db.entity.Stock;
import com.github.walkvoid.easymoney.db.mapper.StockMapper;
import javax.annotation.Resource;
import org.springframework.stereotype.Repository;
/**
 * @author jiangjunqing
 * @date 2025/2/19
 * @description:
 * @version:
 */
@Repository
public class StockDao {

    @Resource
    private StockMapper stockMapper;

    /**
     * Retrieves a Stock by its ID.
     *
     * @param id the ID of the stock to retrieve
     * @return the Stock object with the specified ID, or null if not found
     */
    public Stock getById(Long id) {
        return stockMapper.selectById(id);
    }

    /**
     * Saves a new Stock to the database.
     *
     * @param stock the Stock object to save
     * @return true if the stock was successfully saved, false otherwise
     */
    public boolean save(Stock stock) {
        return stockMapper.insert(stock) > 0;
    }

    /**
     * Updates an existing Stock in the database.
     *
     * @param stock the Stock object with updated information
     * @return true if the stock was successfully updated, false otherwise
     */
    public boolean update(Stock stock) {
        return stockMapper.updateById(stock) > 0;
    }

    /**
     * Deletes a Stock from the database by its ID.
     *
     * @param id the ID of the stock to delete
     * @return true if the stock was successfully deleted, false otherwise
     */
    public boolean delete(Long id) {
        return stockMapper.deleteById(id) > 0;
    }



}
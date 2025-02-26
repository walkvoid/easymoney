package com.github.walkvoid.easymoney.db.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.github.walkvoid.easymoney.db.entity.Stock;
import com.github.walkvoid.easymoney.db.entity.StockTradeTime;
import org.apache.ibatis.annotations.Mapper;

/**
 * @author walkvoid
 * @date 2025/2/19
 * @description:
 * @version:
 */
@Mapper
public interface StockTradeTimeMapper extends BaseMapper<StockTradeTime> {
}

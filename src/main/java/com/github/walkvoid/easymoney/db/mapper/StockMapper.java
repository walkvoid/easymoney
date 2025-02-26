package com.github.walkvoid.easymoney.db.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.github.walkvoid.easymoney.db.entity.Stock;
import org.apache.ibatis.annotations.Mapper;


/**
 * Stock 的 Mapper 接口
 */
@Mapper
public interface StockMapper extends BaseMapper<Stock> {
    // 这里可以添加自定义的查询方法，例如复杂的查询逻辑。
}
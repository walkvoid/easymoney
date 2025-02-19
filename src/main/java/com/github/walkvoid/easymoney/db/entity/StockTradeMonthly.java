package com.github.walkvoid.easymoney.db.entity;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.Serializable;
import java.math.BigDecimal;
import java.time.Month;
import java.time.Year;
import java.time.YearMonth;
import lombok.Data;

/**
 * @ApiModel(description = "股票每月统计信息实体类")
 */
@ApiModel(description = "股票每月统计信息实体类")
@Data
public class StockTradeMonthly implements Serializable {

    @ApiModelProperty(value = "主键ID", required = true, example = "1")
    private Long id;

    @ApiModelProperty(value = "股票代码", required = true, example = "000001")
    private String stockCode;

    @ApiModelProperty(value = "月份（格式：YYYY-MM）", required = true, example = "2023-01")
    private YearMonth yearMonth;

    @ApiModelProperty(value = "平均开盘价", required = true, example = "10.50")
    private BigDecimal openPrice;

    @ApiModelProperty(value = "平均收盘价", required = true, example = "10.75")
    private BigDecimal closePrice;

    @ApiModelProperty(value = "最高价", required = true, example = "11.00")
    private BigDecimal maxPrice;

    @ApiModelProperty(value = "最低价", required = true, example = "10.25")
    private BigDecimal minPrice;

    @ApiModelProperty(value = "总成交量", required = true, example = "1000000")
    private Long quantity;

    @ApiModelProperty(value = "总成交额", required = true, example = "10500000.00")
    private BigDecimal amount;

    // KDJ 指标
    @ApiModelProperty(value = "KDJ K值", example = "60.25")
    private BigDecimal kdjK;

    @ApiModelProperty(value = "KDJ D值", example = "55.75")
    private BigDecimal kdjD;

    @ApiModelProperty(value = "KDJ J值", example = "65.00")
    private BigDecimal kdjJ;
}
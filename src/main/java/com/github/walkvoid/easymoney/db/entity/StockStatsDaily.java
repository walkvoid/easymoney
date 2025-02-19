package com.github.walkvoid.easymoney.db.entity;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.Serializable;
import java.time.LocalDate;
import lombok.Data;

import java.math.BigDecimal;
import java.util.Date;

/**
 * @ApiModel(description = "股票每日统计信息实体类")
 */
@ApiModel(description = "股票每日统计信息实体类")
@Data
public class StockStatsDaily implements Serializable {

    @ApiModelProperty(value = "主键ID", required = true, example = "1")
    private Long id;

    @ApiModelProperty(value = "股票代码", required = true, example = "000001")
    private String stockCode;

    @ApiModelProperty(value = "交易日期", required = true, example = "2023-01-01")
    private LocalDate tradeDate;

    @ApiModelProperty(value = "开盘价", required = true, example = "10.50")
    private BigDecimal openPrice;

    @ApiModelProperty(value = "收盘价", required = true, example = "10.75")
    private BigDecimal closePrice;

    @ApiModelProperty(value = "最高价", required = true, example = "11.00")
    private BigDecimal maxPrice;

    @ApiModelProperty(value = "最低价", required = true, example = "10.25")
    private BigDecimal minPrice;

    @ApiModelProperty(value = "成交量", required = true, example = "1000000")
    private Long quantity;

    @ApiModelProperty(value = "成交额", required = true, example = "10500000.00")
    private BigDecimal amount;

    // KDJ 指标
    @ApiModelProperty(value = "KDJ K值", example = "60.25")
    private BigDecimal kdjK;

    @ApiModelProperty(value = "KDJ D值", example = "55.75")
    private BigDecimal kdjD;

    @ApiModelProperty(value = "KDJ J值", example = "65.00")
    private BigDecimal kdjJ;

    // MACD 指标
    @ApiModelProperty(value = "MACD线", example = "0.50")
    private BigDecimal macdLine;

    @ApiModelProperty(value = "MACD信号线", example = "0.45")
    private BigDecimal macdSignal;

    @ApiModelProperty(value = "MACD柱状图", example = "0.05")
    private BigDecimal macdHistogram;

    // RSI 指标
    @ApiModelProperty(value = "RSI值", example = "58.30")
    private BigDecimal rsiValue;

    // MA 移动平均线
    @ApiModelProperty(value = "5日均线", example = "10.60")
    private BigDecimal ma5;

    @ApiModelProperty(value = "10日均线", example = "10.55")
    private BigDecimal ma10;

    @ApiModelProperty(value = "20日均线", example = "10.50")
    private BigDecimal ma20;

    @ApiModelProperty(value = "60日均线", example = "10.45")
    private BigDecimal ma60;

    // BOLL 布林带
    @ApiModelProperty(value = "布林带上轨", example = "11.20")
    private BigDecimal bollUpper;

    @ApiModelProperty(value = "布林带中轨", example = "10.50")
    private BigDecimal bollMiddle;

    @ApiModelProperty(value = "布林带下轨", example = "9.80")
    private BigDecimal bollLower;
}
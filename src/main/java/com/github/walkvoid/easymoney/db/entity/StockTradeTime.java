package com.github.walkvoid.easymoney.db.entity;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.Serializable;
import java.math.BigDecimal;
import java.time.LocalDateTime;

@ApiModel(description = "股票交易记录模型")
public class StockTradeTime  implements Serializable {

    @ApiModelProperty(value = "主键ID", example = "1", required = true)
    private Long id;

    @ApiModelProperty(value = "股票ID，关联stock表", example = "1", required = true)
    private Long stockId;

    @ApiModelProperty(value = "交易时间", example = "2024-02-10 12:00:00", dataType = "LocalDateTime")
    private LocalDateTime tradeTime;

    @ApiModelProperty(value = "成交价格", example = "1800.00", required = true, dataType = "BigDecimal")
    private BigDecimal price;

    @ApiModelProperty(value = "成交量", example = "100", required = true)
    private Long quantity;

    @ApiModelProperty(value = "交易方向（BUY:买入, SELL:卖出）", example = "BUY", required = true)
    private String direction;

    @ApiModelProperty(value = "创建时间", example = "2023-01-01T12:00:00Z", dataType = "LocalDateTime")
    private LocalDateTime createdAt;

    @ApiModelProperty(value = "更新时间", example = "2023-01-01T12:00:00Z", dataType = "LocalDateTime")
    private LocalDateTime updatedAt;

    // Getters and Setters
}
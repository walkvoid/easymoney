package com.github.walkvoid.easymoney.db.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;
import java.time.LocalDateTime;

@ApiModel(description = "股票基本信息模型")
@TableName("stock")
public class Stock implements Serializable {

    @ApiModelProperty(value = "主键ID", example = "1", required = true)
    private Long id;

    @ApiModelProperty(value = "股票代码", example = "600519", required = true)
    private String stockCode;

    @ApiModelProperty(value = "股票名称", example = "贵州茅台", required = true)
    private String stockName;

    @ApiModelProperty(value = "所属行业", example = "白酒")
    private String industry;

    @ApiModelProperty(value = "市场类型（如沪市、深市）", example = "沪市", required = true)
    private String market;

    @ApiModelProperty(value = "创建时间", example = "2023-01-01T12:00:00Z", dataType = "Timestamp")
    private LocalDateTime createdAt;

    @ApiModelProperty(value = "更新时间", example = "2023-01-01T12:00:00Z", dataType = "Timestamp")
    private LocalDateTime updatedAt;


}
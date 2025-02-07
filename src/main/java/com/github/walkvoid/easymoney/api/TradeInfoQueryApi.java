package com.github.walkvoid.easymoney.api;

import com.github.walkvoid.easymoney.api.req.StockInfoReq;
import com.github.walkvoid.easymoney.db.entity.Stock;

import java.util.List;

/**
 * @author walkvoid
 * @version 1.0
 * @date 2025/2/6
 * @desc
 */
public interface TradeInfoQueryApi {


    ApiResp<List<Stock>> stockInfoList(ApiReq<StockInfoReq> req);
}

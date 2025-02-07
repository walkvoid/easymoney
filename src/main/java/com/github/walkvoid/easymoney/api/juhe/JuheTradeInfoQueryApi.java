package com.github.walkvoid.easymoney.api.juhe;

import com.github.walkvoid.easymoney.api.ApiReq;
import com.github.walkvoid.easymoney.api.ApiResp;
import com.github.walkvoid.easymoney.api.TradeInfoQueryApi;
import com.github.walkvoid.easymoney.api.req.StockInfoReq;
import com.github.walkvoid.easymoney.db.entity.Stock;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * @author walkvoid
 * @version 1.0
 * @date 2025/2/6
 * @desc
 */
@Component
public class JuheTradeInfoQueryApi implements TradeInfoQueryApi {

    @Override
    public ApiResp<List<Stock>> stockInfoList(ApiReq<StockInfoReq> req) {
        return null;
    }
}

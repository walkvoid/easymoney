package com.github.walkvoid.easymoney.datafetch.channel.juhe;

import com.github.walkvoid.easymoney.datafetch.AbstractStockDataFetcher;
import com.github.walkvoid.easymoney.datafetch.req.StockReq;
import com.github.walkvoid.easymoney.datafetch.resp.StockResp;
import com.github.walkvoid.wvframework.models.CommonPageResponse;
import com.github.walkvoid.wvframework.models.PageRequest;

/**
 * @author jiangjunqing
 * @date 2025/2/19
 * @description:
 * @version:
 */
public class JuheStockDataFetcher extends AbstractStockDataFetcher {

    @Override
    public CommonPageResponse<StockResp> fetchStock(PageRequest<StockReq> pageRequest) {
        return null;
    }
}

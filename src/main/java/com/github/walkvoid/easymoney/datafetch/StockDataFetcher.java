package com.github.walkvoid.easymoney.datafetch;

import com.github.walkvoid.easymoney.datafetch.req.StockReq;
import com.github.walkvoid.easymoney.datafetch.resp.StockResp;
import com.github.walkvoid.wvframework.models.CommonPageResponse;
import com.github.walkvoid.wvframework.models.PageRequest;

/**
 * @author walkvoid
 * @date 2025/2/19
 * @description:
 * @version:
 */
public interface StockDataFetcher {


    CommonPageResponse<StockResp> fetchStock(PageRequest<StockReq> pageRequest);
}

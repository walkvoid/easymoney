package com.github.walkvoid.easymoney.datafetch;

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
public abstract class AbstractStockDataFetcher implements StockDataFetcher {


    void completePublishEvent(){}

}

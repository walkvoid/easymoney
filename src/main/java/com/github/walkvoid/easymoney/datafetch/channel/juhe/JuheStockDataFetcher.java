package com.github.walkvoid.easymoney.datafetch.channel.juhe;

import com.github.walkvoid.easymoney.datafetch.AbstractStockDataFetcher;
import com.github.walkvoid.easymoney.datafetch.req.StockReq;
import com.github.walkvoid.easymoney.datafetch.resp.StockResp;
import com.github.walkvoid.wvframework.models.CommonPageResponse;
import com.github.walkvoid.wvframework.models.PageRequest;
import org.springframework.stereotype.Component;

/**
 * @author jiangjunqing
 * @date 2025/2/19
 * @description:
 * @version:
 */
@Component
public class JuheStockDataFetcher extends AbstractStockDataFetcher {


    public CommonPageResponse<StockResp> fetchStock0(PageRequest<StockReq> pageRequest) {
        return null;
    }
}

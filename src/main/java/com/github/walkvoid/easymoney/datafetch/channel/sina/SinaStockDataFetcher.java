package com.github.walkvoid.easymoney.datafetch.channel.sina;

import com.github.walkvoid.easymoney.datafetch.AbstractStockDataFetcher;
import com.github.walkvoid.easymoney.datafetch.StockDataFetcher;
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
public class SinaStockDataFetcher extends AbstractStockDataFetcher {


    public CommonPageResponse<StockResp> fetchStock0(PageRequest<StockReq> pageRequest) {

        return null;
    }

}

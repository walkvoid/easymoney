package com.github.walkvoid.easymoney.datafetch;

import com.github.walkvoid.easymoney.datafetch.req.StockReq;
import com.github.walkvoid.easymoney.datafetch.resp.StockResp;
import com.github.walkvoid.wvframework.models.BaseResponse;
import com.github.walkvoid.wvframework.models.CommonPageResponse;
import com.github.walkvoid.wvframework.models.PageRequest;

/**
 * @author jiangjunqing
 * @date 2025/2/19
 * @description:
 * @version:
 */
public abstract class AbstractStockDataFetcher implements StockDataFetcher {

    protected StockDataFetcher next;


    @Override
    public CommonPageResponse<StockResp> fetchStock(PageRequest<StockReq> pageRequest) {
        CommonPageResponse<StockResp> response = fetchStock0(pageRequest);
        if (response.getCode().equals("200")) {
            publishEvent(response);
            return response;
        }
        if (next != null) {
            return next.fetchStock(pageRequest);
        } else {
          return null;
        }
    }


    protected abstract CommonPageResponse<StockResp> fetchStock0(PageRequest<StockReq> pageRequest);


    protected void publishEvent(BaseResponse<?,?> response){
        if (response.getData() instanceof StockResp) {

        }

    }

    void setNext(StockDataFetcher next){
        this.next = next;
    }
    StockDataFetcher getNext(){
        return this.next;
    }

}

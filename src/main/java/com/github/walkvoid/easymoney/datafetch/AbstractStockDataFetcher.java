package com.github.walkvoid.easymoney.datafetch;

import com.github.walkvoid.easymoney.datafetch.req.StockReq;
import com.github.walkvoid.easymoney.datafetch.resp.StockResp;
import com.github.walkvoid.easymoney.event.StockDataFetchEvent;
import com.github.walkvoid.wvframework.core.concurrent.SmartApplicationEventPublisher;
import com.github.walkvoid.wvframework.models.BaseResponse;
import com.github.walkvoid.wvframework.models.CommonPageResponse;
import com.github.walkvoid.wvframework.models.PageRequest;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

/**
 * @author walkvoid
 * @date 2025/2/19
 * @description:
 * @version:
 */
public abstract class AbstractStockDataFetcher implements StockDataFetcher {

    protected StockDataFetcher next;
    
    @Autowired
    private SmartApplicationEventPublisher eventPublisher;

    @Override
    public CommonPageResponse<StockResp> fetchStock(PageRequest<StockReq> pageRequest) {
        CommonPageResponse<StockResp> response = fetchStock0(pageRequest);
        if (isSuccess(response)) {
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
        if (response instanceof CommonPageResponse) {
            List<StockResp> data = ((CommonPageResponse) response).getData();
            eventPublisher.pushAsyncEvent(new StockDataFetchEvent(data));
        }
    }

    void setNext(StockDataFetcher next){
        this.next = next;
    }

    StockDataFetcher getNext(){
        return this.next;
    }

    protected boolean isSuccess(BaseResponse<String,?> response){
        return ResponseStatus.from(response.getCode()).equals(ResponseStatus.SUCCESS);
    }

}

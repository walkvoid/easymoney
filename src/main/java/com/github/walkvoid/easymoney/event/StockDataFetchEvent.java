package com.github.walkvoid.easymoney.event;

import com.github.walkvoid.easymoney.datafetch.resp.StockResp;
import org.springframework.context.ApplicationEvent;

import java.util.List;

/**
 * @author walkvoid
 * @date 2025/2/20
 * @description:
 * @version:
 */
public class StockDataFetchEvent extends ApplicationEvent {

    public StockDataFetchEvent(List<StockResp> source) {
        super(source);
    }




}

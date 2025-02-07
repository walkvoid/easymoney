package com.github.walkvoid.easymoney.api;

import java.io.Serializable;

/**
 * @author walkvoid
 * @version 1.0
 * @date 2025/2/6
 * @desc
 */
public class ApiReq<T> implements Serializable {

    private String reqTime;

    private long reqTimestamp;

    private String seq;

    private String channel;

    private T reqData;

}

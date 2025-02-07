package com.github.walkvoid.easymoney.api;

import java.io.Serializable;

/**
 * @author walkvoid
 * @version 1.0
 * @date 2025/2/6
 * @desc
 */
public class ApiResp<T> implements Serializable {

    private long costMs;

    private String time;

    private String code;

    private String msg;

    private T data;


}

package com.github.walkvoid.easymoney.datafetch;

import java.util.Arrays;
import java.util.Optional;

/**
 * @author walkvoid
 * @version 1.0
 * @date 2025/2/20
 * @desc
 */
public enum ResponseStatus {
    SUCCESS("200","success"),

    UNKNOWN("500","unknown"),

    ;



    private String code;

    private String message;

    ResponseStatus(String code, String message) {
        this.code = code;
        this.message = message;
    }

    public static ResponseStatus from(String code){
       return Arrays.stream(ResponseStatus.values()).filter(x -> x.code.equalsIgnoreCase(code)).findFirst().orElse(UNKNOWN);
    }



}

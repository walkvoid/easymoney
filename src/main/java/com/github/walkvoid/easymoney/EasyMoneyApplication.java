package com.github.walkvoid.easymoney;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;

/**
 * @author walkvoid
 * @version 1.0
 * @date 2025/2/5
 * @desc EasyMoneyApplication
 */
@SpringBootApplication
public class EasyMoneyApplication {

    public static void main(String[] args) {
        new SpringApplicationBuilder(EasyMoneyApplication.class).run(args);
    }
}

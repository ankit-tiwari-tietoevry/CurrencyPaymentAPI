package com.ztl.country.payment.currency;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = {"com.ztl.country.payment.currency.controller",
        "com.ztl.country.payment.currency.service"})
public class CurrencyPaymentApiApplication {

    public static void main(String[] args) {
        SpringApplication.run(CurrencyPaymentApiApplication.class, args);
    }

}

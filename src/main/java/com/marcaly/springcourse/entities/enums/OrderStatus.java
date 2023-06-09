package com.marcaly.springcourse.entities.enums;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;



public enum OrderStatus {

    WAITING_PAYMENT(1),
    PAID(2),
    SHIPPED(3),
    CANCELED(4);

    private int code;

    private OrderStatus(int code) {
        this.code = code;
    }

    public int getCode() {
        return code;
    }

    public static OrderStatus valueOf(int code) {
        for (OrderStatus value: OrderStatus.values()) {
            if (value.getCode() == code)
                return value;
        }
    throw new IllegalArgumentException("Invalid OrderStatus code");
    }


}

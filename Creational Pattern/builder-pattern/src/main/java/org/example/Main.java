package org.example;

import org.example.builder.impl.OrderBuilderImpl;
import org.example.entity.Order;
import org.example.enums.BreadType;
import org.example.enums.OrderType;
import org.example.enums.SauceType;

public class Main {
    public static void main(String[] args) {
        Order order = new OrderBuilderImpl()
                .orderType(OrderType.ON_SITE).orderBread(BreadType.OMELETTE)
                .orderSauce(SauceType.SOY_SAUCE).build();
        System.out.println(order.toString());
    }
}
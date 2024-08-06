package org.example.builder.interfaces;

import org.example.entity.Order;
import org.example.enums.BreadType;
import org.example.enums.OrderType;
import org.example.enums.SauceType;
import org.example.enums.VegetableType;

public interface OrderBuilder {

    OrderBuilder orderType(OrderType orderType);

    OrderBuilder orderBread(BreadType breadType);

    OrderBuilder orderSauce(SauceType sauceType);

    OrderBuilder orderVegetable(VegetableType vegetableType);

    Order build();
}

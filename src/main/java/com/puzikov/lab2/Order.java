package com.puzikov.lab2;

import java.util.Date;
import java.util.UUID;

// Заказ
public class Order {
    private Date createTime;         // время заказа
    private long waitingTime;        // время ожидания
    private UUID id;
    private Credentials user;
    private ShoppingCart cart;

    public Order(Credentials user, ShoppingCart cart){
        this.cart = cart;
        this.user = user;
    }

}
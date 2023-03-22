package com.puzikov.lab3;

import java.util.Date;
import java.util.UUID;

// Заказ
public class Order {
    private Date createTime;         // время создания
    private long waitingTime = 2000;        // время ожидания
    private UUID id;
    private Credentials user;
    private ShoppingCart cart;
    private StatusOrder status;

    public Order(Credentials user, ShoppingCart cart) {
        this.cart = cart;
        this.user = user;
        this.id = UUID.randomUUID();
        this.createTime = new Date(System.currentTimeMillis());
        this.status = StatusOrder.WAITING;
    }

    public boolean checkInterval(long time) {
        if (time < (createTime.getTime() + waitingTime)) {
            return true;
        } else {
            return false;
        }
    }

    public void show() {
        System.out.println("Ваш заказ:");
        System.out.println("Время создания заказа: " + createTime);
        System.out.println("Время ожидания заказа: " + waitingTime);
        cart.show();
        user.show();
        System.out.println("Статус заказа: " + status);
    }

    public Date getCreateTime() {
        return createTime;
    }

    public long getWaitingTime() {
        return waitingTime;
    }

    public void setStatus(StatusOrder status) {
        this.status = status;
    }

    public StatusOrder getStatus() {
        return status;
    }

    public UUID getId() {
        return id;
    }

    @Override
    public String toString() {
        return "Order{" +
                "createTime=" + createTime +
                ", waitingTime=" + waitingTime +
                ", id=" + id +
                ", user=" + user +
                ", cart=" + cart +
                '}';
    }
}
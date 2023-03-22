package com.puzikov.lab3;

import java.util.*;

// Заказы. Объединение списков заказов
public class Orders<T extends Order> {

    private List<T> orders;               // Коллекция для хранения объектов в классе Orders (Хранит в себе Order)
    private Map<Date, T> dateOrder;                                  // Коллекция для хранения объектов по времени создания

    public Orders() {
        this.orders = new ArrayList<>();
        this.dateOrder = new TreeMap<>();
    }

    public Orders(List<T> orders, Map<Date, T> createTime) {
        this.orders = orders;
        this.dateOrder = createTime;
    }


    @Override
    public String toString() {
        return "Orders{" +
                "orders=" + orders +
                ", dateOrder=" + dateOrder +
                '}';
        // в orders создать метод offer2 на входе shoppingCart и данные пользователя (user),
        // внутри метода создается заказ он добавляется в коллекцуию заказов и коллекцию времени заказов
    }

    public void offer(ShoppingCart cart, Credentials user) throws InterruptedException {
        Order order = new Order(user, cart);
        orders.add((T) order);
        dateOrder.put(order.getCreateTime(),(T) order);
    }

    public void show() {
        for (T order : orders) {
            order.show();
        }
    }

    public void checkTime() {
        for (int i = 0; i < orders.size(); i++) {
            Order order = orders.get(i);
            if (order.getStatus() == StatusOrder.WAITING && order.checkInterval(System.currentTimeMillis())) {
                order.setStatus(StatusOrder.DONE);
                System.out.println("проверка заказа...");
            }

        }
    }


    public List<T> getOrders() {
        return orders;
    }

}


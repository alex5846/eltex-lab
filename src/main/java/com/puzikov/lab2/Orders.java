package com.puzikov.lab2;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

// Заказы. Объединение списков заказов
public class Orders {

    private List<Order> orders;                                            // Коллекция для хранения объектов в классе Orders (Хранит в себе Order)
    private Map dateOrder;                                          // Коллекция для хранения объектов по времени создания

    public Orders() {
        this.orders = new ArrayList<>();
        this.dateOrder = new TreeMap();
    }

    public Orders(List orders, Map createTime) {
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
        orders.add(order);
        dateOrder.put(order.getCreateTime(), order);
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

//    public void deleteOrder(ShoppingCart cart, Credentials user) {                       //Не понятно, откуда должен исчезнуть заказ после его обработки(после истечения времени ожидания)
//        orders.remove(user);
//        dateOrder.remove(order.getCreateTime(), order);
    //           Thread.sleep(order.getWaitingTime());
//    }


}


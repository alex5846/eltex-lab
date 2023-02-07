package com.puzikov.lab2;

import java.util.*;

public class MainTest {
    public static void main(String[] args) {
        // Создать объекты наследников, добавить их в корзину и вывести ORDER в консоль
        Phone phone = new Phone();
        Tablet tablet = new Tablet();
        Smartphone smartphone = new Smartphone();
        phone.create();
        smartphone.create();
        tablet.create();
        Credentials user = new Credentials("Chigyrov", "Mihail", "Evgenevich", "miha123@mail.ru");
        ShoppingCart cart = new ShoppingCart();
        cart.add(smartphone);
        cart.add(phone);
        cart.add(tablet);

        Order order = new Order(user, cart);
        Map<Integer, Date> createTime = new HashMap<>();
        Date createTime2 = new Date(System.currentTimeMillis());
        createTime.put(1, createTime2);
        List orders = new ArrayList<>();
        orders.add(order);
        Orders orders2 = new Orders(orders, createTime);
        System.out.println(order);
        System.out.println(orders);
// в orders создать метод offer2 на входе shoppingCart и данные пользователя (user), внутри метода создается заказ он добавляется в коллекцуию заказов и коллекцию времени заказов

    }

}

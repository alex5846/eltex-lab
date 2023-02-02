package com.puzikov.lab2;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

// Заказы. Объединение списков заказов
public class Orders {

    private List orders;                                            // Коллекция для хранения объектов в классе Orders (Хранит в себе Order)
    private Map dateOrder;                                          // Коллекция для хранения объектов по времени создания

    public Orders() {
        this.orders = new ArrayList();
        this.dateOrder = new TreeMap();
    }

    public Orders(List orders, Map createTime) {
        this.orders = orders;
        this.dateOrder = createTime;
    }

    public void offer(Order order){
        orders.add(order);
        dateOrder.put(order.getCreateTime(), order);
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
    public void offer2(ShoppingCart cart, Credentials user){
        Order order = new Order(user, cart);
        orders.add(order);
        dateOrder.put(order.getCreateTime(), order);
        }
}


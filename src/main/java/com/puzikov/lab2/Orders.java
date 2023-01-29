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
}


package com.puzikov.lab3;

import java.util.*;

// корзина
public class ShoppingCart<T extends Electronics> {
    private List<T> cart;  //коллекция для храннения объектов в классе корзина
    private UUID id;
    private Set<UUID> uuids;

    public ShoppingCart() {
        this.cart = new LinkedList<>();
        this.id = UUID.randomUUID();
        this.uuids = new HashSet<>();
    }

    public void add(T electronics) {
        cart.add(electronics);
        uuids.add(electronics.getId());
    }

    public boolean isExistUUID(UUID id) {    // Проверяет наличие id в корзине
        return uuids.contains(id);
    }

    public void delete(T electronics) {
        cart.remove(electronics);
    }


    public void show() {                        //Метод, выводящий на экран содержание всех товаров, находящихся в карзине
        for (T electronics : cart) {
            electronics.read();
        }
    }

    @Override
    public String toString() {
        return "ShoppingCart{" +
                "cart=" + cart +
                ", id=" + id +
                '}';
    }
}

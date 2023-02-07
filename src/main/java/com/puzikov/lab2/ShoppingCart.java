package com.puzikov.lab2;

import java.util.*;

// корзина
public class ShoppingCart {
    private List cart;  //коллекция для храннения объектов в классе корзина
    private UUID id;
    private Set uuids;

    public ShoppingCart() {
        this.cart = new LinkedList();
        this.id = UUID.randomUUID();
        this.uuids = new HashSet<>();
    }

    public void add(Electronics electronics) {
        cart.add(electronics);
        uuids.add(electronics.getId());
    }

    public void delete(Electronics electronics) {
        cart.remove(electronics);
    }

    @Override
    public String toString() {
        return "ShoppingCart{" +
                "cart=" + cart +
                ", id=" + id +
                '}';
    }
}

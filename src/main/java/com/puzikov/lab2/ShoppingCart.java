package com.puzikov.lab2;

import java.util.LinkedList;
import java.util.List;
import java.util.UUID;

// корзина
public class ShoppingCart {
    private List cart;  //сколлекция для храннения объектов в классе корзина
    private UUID id;

    public ShoppingCart() {
        this.cart = new LinkedList();
        this.id = UUID.randomUUID();
    }

    public void addInCart(Electronics electronics) {
        cart.add(electronics);
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

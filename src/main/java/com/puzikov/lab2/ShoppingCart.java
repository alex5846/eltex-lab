package com.puzikov.lab2;

import java.util.*;

// корзина
public class ShoppingCart {
    private List<Electronics> cart;  //коллекция для храннения объектов в классе корзина
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
    public boolean isExistUUID(UUID id){    // Проверяет наличие id в корзине
        return uuids.contains(id);
    }

    public void delete(Electronics electronics) {
        cart.remove(electronics);
    }

    public void showCart(){
        System.out.println("Элементы в корзине: "+cart);
    }

    public void checkPurchase(){                        //Метод, выводящий на экран содержание всех товаров, находящихся в карзине
        cart.size();
        for (int i=0;i<cart.size(); i++){
            cart.get(i).read();
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

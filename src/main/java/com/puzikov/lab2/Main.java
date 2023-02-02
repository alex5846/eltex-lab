package com.puzikov.lab2;

import java.util.*;


// 6) в абстрактном классе Electronics реализовать CRUD операции. В наследниках при необходимости дополнять логику (ты же можешь вызывать в наследниках родительские методы)

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Credentials user = new Credentials("Иванов", "Иван", "Иванович", "ivanov@mail.ru");
        System.out.println("\nМеню:\n1.Телефон\n2.Смартфон\n3.Планшет\n");
        int choice = scanner.nextInt();
        ShoppingCart cart = new ShoppingCart();


        if (choice == 1) {
            System.out.println("Введите желаемое кол-во товара: ");
            int count = scanner.nextInt();
            if (count >= 0) {
                Phone[] phones = new Phone[count];
                for (int i = 0; i < count; i++) {
                    phones[i] = new Phone();
                    phones[i].create();
                    phones[i].read();
                    cart.addInCart(phones[i]);
                }
                System.out.println("Количество товара: " + Phone.counterObject);
            }
        } else if (choice == 2) {
            System.out.println("Введите желаемое количество товара: ");
            int count = scanner.nextInt();
            if (count >= 0) {
                Smartphone[] smartphone = new Smartphone[count];
                for (int i = 0; i < count; i++) {
                    smartphone[i] = new Smartphone();
                    smartphone[i].create();
                    smartphone[i].read();
                    cart.addInCart(smartphone[i]);
                }
                System.out.println("Количество товара: " + Smartphone.counterObject);
            }
        } else if (choice == 3) {
            System.out.println("Введите желаемое количество товара");
            int count = scanner.nextInt();
            if (count >= 0) {
                Tablet[] tablet = new Tablet[count];
                for (int i = 0; i < count; i++) {
                    tablet[i] = new Tablet();
                    tablet[i].create();
                    tablet[i].read();
                    cart.addInCart(tablet[i]);
                }
                System.out.println("Количество товара: " + Tablet.counterObject);
            }
        }
        System.out.println("1. Оформить заказ\n 2. Отмена");
        int choice2 = scanner.nextInt();
        if (choice2 == 1) {
            Orders orders = new Orders();
            orders.offer2(cart, user);
        }

    }

}


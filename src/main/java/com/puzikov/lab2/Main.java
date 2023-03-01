package com.puzikov.lab2;

import java.util.*;


// todo ты кое-что упустил: 6. Добавить для класса «заказ» поле «статус заказа» (в ожидании, обработан).
public class Main {

    public static void main(String[] args) throws InterruptedException {

        Scanner scanner = new Scanner(System.in);
        Credentials user = new Credentials("Иванов", "Иван", "Иванович", "ivanov@mail.ru");
        System.out.println("\nМеню:\n1.Телефон\n2.Смартфон\n3.Планшет\n");
        int choice = scanner.nextInt();
        ShoppingCart cart = new ShoppingCart();
        Phone[] phones = null;
        //   Tablet[] tablets = null;
        // Smartphone[] smartphones = null;

        if (choice == 1) {
            System.out.println("Введите желаемое кол-во товара: ");
            int count = scanner.nextInt();
            if (count >= 0) {
                phones = new Phone[count];
                for (int i = 0; i < count; i++) {
                    phones[i] = new Phone();
                    phones[i].create();
                    //phones[i].read();
                    cart.add(phones[i]);
                }
                // System.out.println("Количество товара: " + Phone.counterObject);
            }
        } else if (choice == 2) {
            System.out.println("Введите желаемое количество товара: ");
            int count = scanner.nextInt();
            if (count >= 0) {
                Smartphone[] smartphone = new Smartphone[count];
                for (int i = 0; i < count; i++) {
                    smartphone[i] = new Smartphone();
                    smartphone[i].create();
                    //smartphone[i].read();
                    cart.add(smartphone[i]);
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
                    cart.add(tablet[i]);
                }
                //  System.out.println("Количество товара: " + Tablet.counterObject);
            }
        }
        System.out.println("1. Оформить заказ\n2. Отмена");
        int choice2 = scanner.nextInt();
        if (choice2 == 1) {
            Orders orders = new Orders();
            orders.offer(cart, user);           // Добавляет заказ в Заказы
            if (Objects.nonNull(phones)) {
                cart.isExistUUID(phones[0].getId());        // Проверяет наличие id в корзине

            }
            orders.checkTime();
            System.out.println("Статус заказа: "+orders.getOrders().get(0).getStatus());
            System.out.println("Вы купили товары со следующими характеристиками: ");
            cart.checkPurchase();
        }

    }

}


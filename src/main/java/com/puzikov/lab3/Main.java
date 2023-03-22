package com.puzikov.lab3;

import java.util.Objects;
import java.util.Scanner;


public class Main {

    public static void main(String[] args) throws InterruptedException {

        Scanner scanner = new Scanner(System.in);
        Credentials user = new Credentials("Иванов", "Иван", "Иванович", "ivanov@mail.ru");
        int choice;
        ShoppingCart cart = new ShoppingCart();
        Phone[] phones = null;
        boolean incorrectChoice = true;
        while (incorrectChoice) {
            System.out.println("\nМеню:\n1.Телефон\n2.Смартфон\n3.Планшет\n0.Выход");
            choice = scanner.nextInt();

            if (choice == 1) {
                incorrectChoice = false;
                System.out.println("Введите желаемое кол-во товара: ");
                int count = scanner.nextInt();
                if (count >= 0) {
                    phones = new Phone[count];
                    for (int i = 0; i < count; i++) {
                        phones[i] = new Phone();
                        phones[i].create();
                        cart.add(phones[i]);
                    }
                }
            } else if (choice == 2) {
                incorrectChoice = false;
                System.out.println("Введите желаемое количество товара: ");
                int count = scanner.nextInt();
                if (count >= 0) {
                    Smartphone[] smartphone = new Smartphone[count];
                    for (int i = 0; i < count; i++) {
                        smartphone[i] = new Smartphone();
                        smartphone[i].create();
                        cart.add(smartphone[i]);
                    }
                }
            } else if (choice == 3) {
                incorrectChoice = false;
                System.out.println("Введите желаемое количество товара");
                int count = scanner.nextInt();
                if (count >= 0) {
                    Tablet[] tablet = new Tablet[count];
                    for (int i = 0; i < count; i++) {
                        tablet[i] = new Tablet();
                        tablet[i].create();
                        cart.add(tablet[i]);
                    }
                }
            } else if (choice == 0) {
                return;
            } else {
                System.out.println("Введено некорректное значение. Выберете верный пункт из меню");
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
            // System.out.println("Статус заказа: "+orders.getOrders().get(0).getStatus());
            // System.out.println("Вы купили товары со следующими характеристиками: ");
            orders.show();
        }

    }

}


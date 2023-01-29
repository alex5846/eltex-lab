package com.puzikov.lab2;

import java.util.Scanner;


// 6) в абстрактном классе Electronics реализовать CRUD операции. В наследниках при необходимости дополнять логику (ты же можешь вызывать в наследниках родительские методы)

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
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
        }
        if (choice == 2) {
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
        }
        if (choice == 3) {
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
        System.out.println("Желаете ли вы оформить заказ?\n 1. Да \n 2. Нет");
        int count = scanner.nextInt();
        if (count == 1) {
            System.out.println("Для оформления заказа неообходима регистрация: \n Введите свою фамилию");
            String surnameUser = scanner.nextLine();
            System.out.println("Введите свое имя");
            String nameUser = scanner.nextLine();
            System.out.println("Введите свое отчество");
            String patronymicUser = scanner.nextLine();
            System.out.println("Введите свой email");
            String email = scanner.nextLine();
            Credentials user = new Credentials(surnameUser, nameUser, patronymicUser, email);
            System.out.println("Введите 1 для завершения регистрации");
            int completion = scanner.nextInt();
            if (completion == 1) {
                Order order = new Order(user, cart);

            }
        }
    }
}


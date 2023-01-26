package com.puzikov.lab2;

import java.util.Scanner;

//todo общие замечания:
// 1) переделать структуру меню (зачем ты заставляешь кого-то покупать планшет, если ему его не надо?)
// хочу видеть такую
//      Меню:
//      1.Телефон
//      2.Смартфон
//      3.Планшет
// после выбора чего-то запрашивается кол-во товара
// 2) перерабоать логку меню
// 3) вынести логику меню в main класс
// 4) переименовать методы интерфеса
// 5) слеать класс Electronics абстрактным и вынести в него общие поля
// 6) в абстрактном классе Electronics реализовать CRUD операции. В наследниках при необходимости дополнять логику (ты же можешь вызывать в наследниках родительские методы)
// 7) для простоты реализуй пока только и два метода - create и read

//todo этот список замечаний не удаляй. Потом пробежисмя и посмотрим что исправил, а что нет.
// Из других мест по ходу исправления можешь сдалять мои записи

public class Main {

    public static void main(String[] args) {

        //  System.out.println(Credentials.);
        Scanner scanner = new Scanner(System.in);
        System.out.println("\nМеню:\n1.Телефон\n2.Смартфон\n3.Планшет\n");
        int choice = scanner.nextInt();

        if (choice == 1) {
            System.out.println("Введите желаемое кол-во товара: ");
            int count = scanner.nextInt();
            if (count >= 0) {
                Phone[] phones = new Phone[count];
                for (int i = 0; i < count; i++) {
                    phones[i] = new Phone();
                    phones[i].create();
                    phones[i].read();
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
                }


                System.out.println("Количество товара: " + Tablet.counterObject);

            }
        }
        System.out.println("Желаете ли вы оформить заказ?\n 1. Да\2. Нет");
        int count = scanner.nextInt();
        if (count == 1) {
            System.out.println("Для оформления заказа неообходимо заполнить поля: \n Введите свою фамилию");
            String surnameUser = scanner.nextLine();
            System.out.println("Введите свое имя");
            String nameUser = scanner.nextLine();
            System.out.println("Введите свое отчество");
            String patronymicUser = scanner.nextLine();
            System.out.println("Введите свой email");
            String email = scanner.nextLine();
            Credentials credentials = new Credentials(surnameUser, nameUser, patronymicUser, email);
            credentials.add    // Добавление объекта в корзину
        }
    }
}

package com.puzikov.lab1;

import java.util.UUID;

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

        //todo а если я не хочу покупать смартфон? а ты уже создал объект и присвоил ему id
        UUID id = UUID.randomUUID();
        Smartphone smartphone = new Smartphone(id);

        //todo а если я не хочу покупать телефон? а ты уже создал объект и присвоил ему id
        UUID idPhone = UUID.randomUUID();
        Phone phone = new Phone(idPhone);

        //todo а если я не хочу покупать планшет (или что это? :) )? а ты уже создал объект и присвоил ему id
        UUID idTablet = UUID.randomUUID();
        Tablet tablet = new Tablet(idTablet);


        //todo если я не хочу покупать телефон, зачем вызывать на нем что-то?...по аналогии с другими товарами
        phone.startRead();
        phone.startUpdate();

        tablet.startRead();
        tablet.startUpdate();

        smartphone.startRead();
        smartphone.startUpdate();

        phone.startCreate();
        phone.startDelete();
        tablet.startCreate();
        tablet.startDelete();
        smartphone.startCreate();
        smartphone.startDelete();


    }
//    public void startUpdate() {
//        System.out.println("Введите количество вводимых объектов, числовым значением");
//        Scanner sumObject = new Scanner(System.in);
//        System.out.println("Введите вид представления");
//        Scanner typePredstavleniya = new Scanner(System.in);
//    };

}


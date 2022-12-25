package com.puzikov.lab1;

import java.util.UUID;

public class Main {
    public static void main(String[] args) {
        UUID id = UUID.randomUUID();
        Smartphone smartphone = new Smartphone(id);

        UUID idPhone = UUID.randomUUID();
        Phone phone = new Phone(idPhone);

        UUID idTablet = UUID.randomUUID();
        Tablet tablet = new Tablet(idTablet);

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


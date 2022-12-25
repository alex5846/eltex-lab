package com.puzikov.lab1;

import java.util.Scanner;
import java.util.UUID;

public class Smartphone extends Electronics {
    int typSim;

    int  counterSmartphone;
    int counterSim;
    UUID id;
    public Smartphone(UUID id){this.id = id;}
    public void startRead() {
        System.out.println("Введите последовательно: \n Сколько вы желаете приобрести смартфонов?\n" +
                "Если хотите тип sim-карты micro-SIM, то нажмите 1, если обычную, то 2 \n" +
                "Сколько вы хотите sim-карт?");
    }
    public void startUpdate() {
    Scanner amountSmart = new Scanner(System.in);
        Integer amountSmart1 = amountSmart.nextInt();
        counterSmartphone = amountSmart1;
        if (amountSmart1 > 0) {
            Scanner typeSim1 = new Scanner(System.in);
            Integer typeSim3 = typeSim1.nextInt();
            typSim = typeSim3;

            Scanner amountSim1 = new Scanner(System.in);
           Integer amountSim = amountSim1.nextInt();
            counterSim = amountSim;
        }
    }
    public void startCreate(){
        System.out.println("Вы заказали "+counterSmartphone+" смартфонов");
        if (counterSmartphone >0) {
            if (typSim == 1) {
                System.out.println("Выбран тип sim-карты micro-SIM");
            } else {
                System.out.println("Выбран тип sim-карты обычная-SIM");
            }
            System.out.println("Количество sim-карт "+counterSim);
            System.out.println("Идентификатор смартфона "+id);
        }

    };
}
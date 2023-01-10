package com.puzikov.lab1;

import java.util.Scanner;
import java.util.UUID;

public class Tablet extends Electronics {
    int countTablet;

    UUID idTablet;
    public Tablet(UUID idTablet){this.idTablet = idTablet;}
    int CPU;
    //todo почему строку так создаешь?
    // расскажешь чем отличается String cpu1 = "a"; от String cpu1 = new String ("a");
    // не смущает что серым подкрашено?))
    String cpu1 = " производительный GeForce RTX 3050";
    String cpu2 = " обычный";
    String xy = " 8к";

    public void startRead() {
        System.out.println("Введите последовательно: \n Сколько вы желаете приобрести планшетов? \n " +
                "Если вы хотите обычный видеопроцессор, нажмите 1, если производительный, нажмите 2");
    }
    public void startUpdate(){
        // todo а тут тебе сама среда разработки говорит что у тебя код почти дублирется с кодом в таком же методе.
        Scanner amountTablet = new Scanner(System.in);
        Integer amountTablet1 = amountTablet.nextInt();
        countTablet = amountTablet1;
        if (amountTablet1 > 0) {
            Scanner typeVideoprocessor = new Scanner(System.in);
            CPU = typeVideoprocessor.nextInt();
        }
    }
    public void startDelete() {
        countTablet =0;

    }


    public void startCreate() {
        System.out.println("Вы заказали "+countTablet+"планшетов");
        if (countTablet >0){
            if (CPU == 1){
                System.out.println("Тип видеопроцессора "+cpu2);
            }
            else
            {
                System.out.println("Тип видеопроцессора "+cpu1);
            }
            System.out.println("Разрешение экрана "+xy);
            System.out.println("Идентификатор смартфона "+idTablet);
        }
    }
}


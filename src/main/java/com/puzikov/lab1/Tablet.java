package com.puzikov.lab1;

import java.util.Scanner;
import java.util.UUID;

public class Tablet extends Electronics {
    UUID idTablet;
    public Tablet(UUID idTablet){this.idTablet = idTablet;}
    String cpu = new String("videoprocessor");
    String xy = new String("screenResolution");

    public void startRead() {
        System.out.println("Введите последовательно: \n Сколько вы желаете приобрести планшетов? \n " +
                "Если вы хотите обычный видеопроцессор, нажмите 1, если производительный, нажмите 2");
    }
    public void startUpdate(){
        Scanner amountTablet = new Scanner(System.in);
        Integer amountTablet1 = amountTablet.nextInt();
        if (amountTablet1 > 0) {
            Scanner typeVideoprocessor = new Scanner(System.in);
            Integer typeVideoprocessor1 = typeVideoprocessor.nextInt();
        }
    }

    }


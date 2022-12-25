package com.puzikov.lab1;

import java.util.Scanner;
import java.util.UUID;

public class Phone extends Electronics{
    String typeSim = new String("microSim");
    UUID idPhone;
    public Phone(UUID idPhone){this.idPhone = idPhone;};
    public void startRead() {
        System.out.println("Введите последовательно: \n Сколько вы желаете приобрести телефонов? \n" +
                "Если хотите тип sim-карты micro-SIM, то нажмите 1, если обычную, то 2");
    }
    public void startUpdate(){
        Scanner amountPhone = new Scanner(System.in);
        Integer amountPhone1 = amountPhone.nextInt();
        if (amountPhone1 > 0) {
            Scanner typeSim1 = new Scanner(System.in);
            Integer typeSim2 = typeSim1.nextInt();
        }

    }
}
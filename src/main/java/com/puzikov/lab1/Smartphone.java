package com.puzikov.lab1;

import java.util.Scanner;
import java.util.UUID;

public class Smartphone extends Electronics {
    private String typeOfSim; //тип сим-карты
    private String amountOfSim; // колчисество сим-карт
    @Override
    public void create() {
        super.create();
        RandValue randValue = new RandValue();
        this.typeOfSim = randValue.getRandomTypeOfShell();
    }

}
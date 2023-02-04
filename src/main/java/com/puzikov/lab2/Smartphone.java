package com.puzikov.lab2;

public class Smartphone extends Electronics {
    private String typeOfSim; //тип сим-карты
    private String amountOfSim; // колчисество сим-карт

    public Smartphone() {
        super();
        counterObject++;
    }

    @Override
    public void create() {
        super.create();
        RandValue randValue = new RandValue();
        this.typeOfSim = randValue.getRandomTypeOfSim();
        this.amountOfSim = randValue.getRandomAmountOfSim();

    }

}
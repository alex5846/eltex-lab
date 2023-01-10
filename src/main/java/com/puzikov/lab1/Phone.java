package com.puzikov.lab1;


public class Phone extends Electronics {
    private String typeOfShell; //тип корпуса

    @Override
    public void create() {
        super.create();
        RandValue randValue = new RandValue();
        this.typeOfShell = randValue.getRandomTypeOfShell();
    }

}

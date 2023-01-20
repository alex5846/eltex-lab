package com.puzikov.lab1;


public class Phone extends Electronics {
    private String typeOfShell; //тип корпуса
    public Phone(){
        super();
        counterObject++;
    }
    @Override
    public void create() {
        super.create();
        RandValue randValue = new RandValue();
        this.typeOfShell = randValue.getRandomTypeOfShell();
    }
}

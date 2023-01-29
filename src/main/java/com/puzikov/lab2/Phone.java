package com.puzikov.lab2;


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


    @Override
    public String toString() {
        return "Phone{" +
                "typeOfShell='" + typeOfShell + '\'' +
                ", name='" + name + '\'' +
                ", price=" + price +
                ", firm='" + firm + '\'' +
                ", model='" + model + '\'' +
                ", os='" + os + '\'' +
                '}';
    }
}

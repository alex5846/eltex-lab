package com.puzikov.lab1;

public class Tablet extends Electronics {
    private String videoProcessor;
    private String creenResolution;
    public Tablet(){
        super();
        counterObject++;
    }
    @Override
    public void create(){
        super.create();
        RandValue randValue = new RandValue();
        this.videoProcessor = randValue.getVideoProcessor();
        this.creenResolution = randValue.getScreenResolution();
    }

}


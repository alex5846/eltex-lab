package com.puzikov.lab2;

public class Tablet extends Electronics {
    private String videoProcessor;
    private String screenResolution;

    public Tablet() {
        super();
        counterObject++;
    }

    @Override
    public void create() {
        super.create();
        RandValue randValue = new RandValue();
        this.videoProcessor = randValue.getVideoProcessor();
        this.screenResolution = randValue.getScreenResolution();
    }

}


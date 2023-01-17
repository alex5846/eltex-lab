package com.puzikov.lab1;

import java.util.Scanner;
import java.util.UUID;

public class Tablet extends Electronics {
    private String videoProcessor;
    private String creenResolution;
    @Override
    public void create(){
        super.create();
        RandValue randValue = new RandValue();
        this.videoProcessor = randValue.getVideoProcessor();
        this.creenResolution = randValue.getScreenResolution();
    }

}


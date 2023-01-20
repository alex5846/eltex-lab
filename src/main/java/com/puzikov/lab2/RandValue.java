package com.puzikov.lab2;

import java.util.Random;

public class RandValue {

    private final String[] NAME_PHONE = {"Nokia", "Samsung", "Apple", "Xiaomi", "Philips", "Meizu", "Honor"};
    private final String[] FIRM = {"Япония", "США", "Россия", "Чехия"};
    private final String[] MODEL = {"2020 года", "2007 года", "2022 года"};
    private final String[] OS = {"Android", "IOS"};
    private final String[] TYPE_OF_SHELL = {"классический", "раскладушка"};
    private final String[] TYPE_OF_SIM = {"mini-sim", "micro-sim", "nano-sim"}; // тип симкарт
    private final String[] AMOUNT_OF_SIM = {"1 sim", "2 sim"};  // количество симкарт
    private final String[] SCREEN_RESOLUTION = {"5 дюймов", "7 дюймов", "10 дюймов"}; //диагональ
    private final String[] VIDEO_PROCESSOR = {"дискретный видеопроцессор", "встроенный видеопроцессор", "гибридный видеопроцессор"};

    Random random = new Random();
    public String getScreenResolution(){
        return SCREEN_RESOLUTION[random.nextInt(SCREEN_RESOLUTION.length)];

    }
    public String getVideoProcessor(){

        return VIDEO_PROCESSOR[random.nextInt(VIDEO_PROCESSOR.length)];
    }

    public String getRandomTypeOfSim() {
        return TYPE_OF_SIM[random.nextInt(TYPE_OF_SIM.length)];
    }

    public String getRandomAmountOfSim() {
        return AMOUNT_OF_SIM[random.nextInt(AMOUNT_OF_SIM.length)];
    }

    public String getRandomTypeOfShell() {
        return TYPE_OF_SHELL[random.nextInt(TYPE_OF_SHELL.length)];
    }

    public String getRandomNamePhone() {
        return NAME_PHONE[random.nextInt(NAME_PHONE.length)];
    }

    public String getRandomOS() {
        return OS[random.nextInt(OS.length)];
    }

    public String getRandomModel() {
        return MODEL[random.nextInt(MODEL.length)];
    }

    public String getRandomFirm() {
        return FIRM[random.nextInt(FIRM.length)];
    }

}

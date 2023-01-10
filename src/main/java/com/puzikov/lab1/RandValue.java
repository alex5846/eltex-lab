package com.puzikov.lab1;

import java.util.Random;

public class RandValue {

    private final String[] NAME_PHONE = {"Nokia", "Samsung", "Apple", "Xiaomi", "Philips", "Meizu", "Honor"};
    private final String[] FIRM = {"Япония", "США", "Россия", "Чехия"};
    private final String[] MODEL = {"2020 года", "2007 года", "2022 года"};
    private final String[] OS = {"Android", "IOS"};
    private final String[] TYPE_OF_SHELL = {"классический", "раскладушка"};

    Random random = new Random();

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

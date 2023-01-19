package com.puzikov.lab1;


import java.util.Random;
import java.util.UUID;

abstract public class Electronics implements ICrudAction {

    private UUID id;//id товара
    public String name; //имя
    public int price; // цена
    protected String firm; // фирма
    protected String model; // модель
    protected String os; // операционная система

    public static int counterObject; // Счетчик сколько было заказано товаров

      public void create() {
        Random random = new Random();
        RandValue randValue = new RandValue();
        this.id = UUID.randomUUID();
        this.name = randValue.getRandomNamePhone();
        this.price = random.nextInt(1000);
        this.firm = randValue.getRandomFirm();
        this.model = randValue.getRandomModel();
        this.os = randValue.getRandomOS();

    }                                                              // заполнение объекта случайными значениями и инкремент счётчика
    public void read() {
        System.out.println("Наименование товара "+name+";\n его характеристики:\n"+"Цена - "+price+
                "Фирма - "+firm+";\n Модель - "+model+";\n Операционная система - "+
                os+";\n Идентификатор товара - "+id+"\n");
    }                                                               // вывод данных на экран

    public void update() {

    }                                                                // ввод данных с клавиатуры

    public void delete() {

    }                                                                // принудительное зануление данных в объекте и декремент счетчика

}


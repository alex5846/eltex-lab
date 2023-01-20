package com.puzikov.lab1;


import java.util.Random;
import java.util.Scanner;
import java.util.UUID;

abstract public class Electronics implements ICrudAction {

    private UUID id;//id товара
    public String name; //имя
    public int price; // цена
    protected String firm; // фирма
    protected String model; // модель
    protected String os; // операционная система

    public static int counterObject; // Счетчик сколько было заказано товаров

    // заполнение объекта случайными значениями и инкремент счётчика
    public void create() {
        Random random = new Random();
        RandValue randValue = new RandValue();
        this.id = UUID.randomUUID();
        this.name = randValue.getRandomNamePhone();
        this.price = random.nextInt(1000);
        this.firm = randValue.getRandomFirm();
        this.model = randValue.getRandomModel();
        this.os = randValue.getRandomOS();
    }

    // вывод данных на экран
    public void read() {
        System.out.println("Наименование товара - " + name + ";\n " +
                "его характеристики:\n" +
                "Цена - " + price + ";\n" +
                "Фирма - " + firm + ";\n " +
                "Модель - " + model + ";\n " +
                "Операционная система - " + os + ";\n " +
                "Идентификатор товара - " + id + ";\n");
    }

    // ввод данных с клавиатуры (обновление данных)
    public void update() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите цену товара: ");
        this.price = scanner.nextInt();
        System.out.println("Введите имя товара: ");
        this.name = scanner.nextLine();
        System.out.println("Введите фирму: ");
        this.firm = scanner.nextLine();
        System.out.println("Введите модель: ");
        this.model = scanner.nextLine();
        System.out.println("Введите операционную систему: ");
        this.os = scanner.nextLine();
    }

    // принудительное зануление данных в объекте и декремент счетчика
    public void delete() {
        this.price = 0;
        this.name = "";
        this.firm = "";
        this.model = "";
        this.os = "";
        counterObject--;
    }

}


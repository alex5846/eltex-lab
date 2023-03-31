package com.puzikov.lab3;

import java.util.*;

public class MainTest1 {
    public static void main(String[] args) {
        // Создать объекты наследников, добавить их в корзину и вывести ORDER в консоль
//        Phone phone = new Phone();
//        Tablet tablet = new Tablet();
//        Smartphone smartphone = new Smartphone();
//        phone.create();
//        smartphone.create();
//        tablet.create();
//        Credentials user = new Credentials("Chigyrov", "Mihail", "Evgenevich", "miha123@mail.ru");
//        ShoppingCart cart = new ShoppingCart();
//        cart.add(smartphone);
//        cart.add(phone);
//        cart.add(tablet);
//
//        Order order = new Order(user, cart);
//        Map<Integer, Date> createTime = new HashMap<>();
//        Date createTime2 = new Date(System.currentTimeMillis());
//        createTime.put(1, createTime2);
//        List orders = new ArrayList<>();
//        orders.add(order);
//        Orders orders2 = new Orders(orders, createTime);
//        System.out.println(order);
//        System.out.println(orders);
//
//
/*  Ниже приведен проимер лямбда-выражение.
Создается интерфейс I, в котором объявлена численная переменная  abc, которая ожидает в параметрах
строковое значение. Реализует этот интерфейс метод def, который выводит в консоль реализацию интерфейса
над экземпляром i типа I. Метод передает в параметр интерфейса слово "privet". Но конкретная реализация
этого интерфейса прописывается лишь в ламбда-выражении, которая пишется в main. Можно было прописать так:
def(String::length); Для первого варианта написания можно было не писать фигурные скобки(только если используется один параметр). Тогда слово "return"
и точка с запятой будут лишние. def((String str) -> str);

 */
        def((String str) -> {return str.length();});

    }

        interface I {
            int abc (String s);

        }

static void def (I i){
    System.out.println(i.abc("privet"));


    }
}


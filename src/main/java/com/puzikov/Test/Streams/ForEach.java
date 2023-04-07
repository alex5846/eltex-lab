package com.puzikov.Test.Streams;

import java.util.Arrays;

public class ForEach {
    /*этот метод возвращает метод void, это значит, что ничего ен возвращает. После применения метода нельзя
    * преобразовать в коллекцию при помощи метода collect. Метод позволяет просмаотривать элементы потока*/


    public static void main(String[] args) {
        int[] array = {5, 9, 3, 8, 1};
        Arrays.stream(array).forEach(e->{System.out.println(e);});   //Удваиваем все элементы и выводим на экран
        Arrays.stream(array).forEach(System.out::println); //Выводит на экран все эементы массива, без удвоения
        Arrays.stream(array).forEach(Utils::myMethod); //Для каждого элемента применили метод muMethod. Аналог forEach e->Utils.myMethod(e)
    }// Данное использование называется методом "референс". Обращаемся к каждому элементу
}
class  Utils{
    public static void myMethod(int a){
        a=a+5;
        System.out.println("Element = "+ a);
    }
}
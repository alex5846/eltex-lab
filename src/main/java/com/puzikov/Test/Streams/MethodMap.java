package com.puzikov.Test.Streams;

import java.lang.reflect.Array;
import java.util.*;
import java.util.stream.Collectors;

public class MethodMap {
    public static void main(String[] args) {
        List<String>list = new ArrayList<>();
        list.add("Privet");
        list.add("Kak dela?");
        list.add("Ok");
        list.add("Poka");
             /*---------------------------------------------------------------
             Код ниже заменяет строковые значения в массиве, на численные значения длин этих строк
              */
         for (int i =0; i< list.size(); i++){
             list.set(i,String.valueOf(list.get(i).length()));}
             /*----------------------------------------------------------------
        Ниже выполняется та же функция, только через streams. Stream преобразовал коллекцию в поток
        На потоке вызвали метод map, который каждому элементу из потока сопоставил то, что мы указали
        в скобках. В нашем случае это длина элемента. Метод collect преобразовал поток в лист.*/
        List<Integer> list2= list.stream().map(element->element.length()) // Могли написать заместо "element ->element.letnght()", "e-e.lenght()"
                .collect(Collectors.toList());  //преобразовывает поток в лист
        System.out.println(list2);
        /* ---------------------------------------------------------------------
        Применение метода streams на массиве. Заменяем числа в массиве, неделящиеся нацело на 3, на
         значение, деленное на 3*/
        int[] array = {5,9,3,8,1};
        array = Arrays.stream(array).map(element-> {
            if (element % 3 == 0
            ) {
                element = element/3;}
                return  element;
            }).toArray(); //преобразовывает поток в массив
        System.out.println(Arrays.toString(array));
        /*----------------------------------------------------------------------
        Далее разобран пример на коллекции set
        */
        Set<String> set = new TreeSet<>();
        set.add("Privet");
        set.add("Kak dela?");
        set.add("Ok");
        set.add("Poka");
        System.out.println(set);

        Set<Integer> set2 = set.stream().map(e->e.length()).collect(Collectors.toSet());
        System.out.println(set2);
         }
    }


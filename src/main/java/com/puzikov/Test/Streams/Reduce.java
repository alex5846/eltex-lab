package com.puzikov.Test.Streams;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class Reduce {
    public static void main(String[] args) {

        List<Integer> list = new ArrayList<>();
        list.add(5);
        list.add(8);
        list.add(2);
        list.add(4);
        list.add(3);
        int result = list.stream().reduce((accumulator, element) ->
                accumulator * element).get();
        System.out.println(result);
        //5, 8, 2, 4, 3   - поток значений
        // accumulator = 5  40  80  320  960 (выводит число 960)
        // element =     8   2   4   3
        List<Integer> list2 = new ArrayList<>();
        list.add(5);
        list.add(8);
        list.add(2);
        list.add(4);
        list.add(3);
        /*метод способен перемножает все элементы потока. Метод возвращает Optional*/
        Optional<Integer> result2 = list2.stream().reduce((accumulator, element) ->
                accumulator * element);
/*Метод isPresent проверяет наличие элементов в потоке */
        if(result2.isPresent()){
            System.out.println(result2.get());
        } else {
            System.out.println("In collect is not present elements");
        }


    }
}

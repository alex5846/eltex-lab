package com.puzikov.Test.LambdaExpression;

import java.util.ArrayList;
import java.util.function.Predicate;

public class Main {
    public static class MainTest1 {
        public static void main(String[] args) {
    
            //---------------------------------------------------------------------------------------
            //         predicateMain
            //         Predicate встроенный функциональный интерфейс, добавленный в Java SE 8 в пакет java.util.function.
            //
            // Принимает на вход значение, проверяет состояние и возвращает boolean значение в качестве результата.
            //
            // Predicate подтверждает какое-то значение как true или false.
            Pr predicate1 = new Pr("Leha", 1);
            System.out.println(predicate1.getNumber());
            Predicate<Integer> sort1 = i -> predicate1.getNumber() < 2;
            if (sort1.test(predicate1.getNumber())){
                System.out.println(predicate1.getName()+"соответствует критериям сортировки");
            }
    //Числа проверены, удовлетворяют ли они условиям сортировки
            Predicate<Integer> sort = i -> i < 0;
            System.out.println(sort.test(-6));
            System.out.println(sort.test(6));
            System.out.println(sort.test(0));
    //Далее произведена сортровка коллекции и удалены все элементы неудовлетворяющие условию
            ArrayList<String> prList = new ArrayList<>();
            prList.add("hello");
            prList.add("goodbye");
            prList.add("ok");
            prList.removeIf(element -> element.length()<4);
    
            /*
            -----------------------------------------------------------------------------------------
             */
    
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
        /* ------------------------------------------------------------------------------------------
        Predicate
        Интерфейс, возвращающий значение boolean, если в параметры передается значение необходимого типа данных
         */
        static class Pr{
            public String name;
            public int number;
    
            public Pr(String name, int number){
                this.name=name;
                this.number=number;
            }
    
            public int getNumber(){return number;}
            public String getName(){return name;}
    
        }
    //    static boolean predicateTest(Predicate<Pr> pr) {
    //        Pr pr1 = new Pr("Leha", 100);
    //        if (pr.test(pr1)) {
    //            System.out.println(pr1);}
    
     }
}

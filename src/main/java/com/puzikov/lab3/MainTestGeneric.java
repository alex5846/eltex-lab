package com.puzikov.lab3;

import java.util.*;

public class MainTestGeneric {
    public static void main(String[] args) {
        Animal<Integer, String> animal = new Animal<>(43, "Help");
        Animal<Integer, String> animal2 = new Animal<>(18,"Bobik");
        System.out.println(animal+"\n "+animal2);

    }

}
class Animal<T, V>{
    public T namber1;
    public V namber2;
    public  Animal (T namber1, V namber2){
        this.namber1 = namber1;
        this.namber2 = namber2;
}

public String toString(){
        return namber1 + " какой-то текст";
}
class GenMethod{
        public <T extends Animal> T getAnimmal(ArrayList<T> animal){

            return animal.get(1);
        }
}
}


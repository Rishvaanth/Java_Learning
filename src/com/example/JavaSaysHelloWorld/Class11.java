package com.example.JavaSaysHelloWorld;

import java.util.ArrayList;

public class Class11 {
    //Arraylists
    public static void main(String[] args) {
        ArrayList<String> cars = new ArrayList<String>();
        cars.add("Ford");
        cars.add("Ferrari");
        cars.add("BMW");
        cars.add("Porsche");
        System.out.println(cars);
        System.out.println(cars.get(0));
    }
}

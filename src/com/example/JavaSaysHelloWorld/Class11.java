package com.example.JavaSaysHelloWorld;

import java.util.ArrayList;
import java.util.Collections;

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
        cars.set(0, "Rover");
        System.out.println(cars);
        System.out.println(cars.get(0));
        cars.remove(0);
        System.out.println(cars);
        System.out.println(cars.get(0));
        System.out.println(cars.size());
        Collections.sort(cars);
        System.out.println(cars);
        cars.clear();
        System.out.println(cars.size());
    }
}

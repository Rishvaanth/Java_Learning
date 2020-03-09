package com.example.JavaSaysHelloWorld;
//Hash Maps

import java.util.HashMap;

public class Class12 {
    public static void main(String[] args) {
        HashMap<Integer, String> list = new HashMap<>();
        list.put(1, "Hello");
        list.put(2, "Violets");
        list.put(3, "Hash browns");
        System.out.println(list);
        System.out.println("The Size of the list is: " + list.size());
        System.out.println(list.get(2));
        System.out.println(list.keySet());
        for (Integer i : list.keySet()) {
            System.out.println("The Key is: " + i + " The value is: " + list.get(i) + "\n");
        }

    }
}

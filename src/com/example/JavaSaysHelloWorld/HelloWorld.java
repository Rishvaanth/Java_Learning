package com.example.JavaSaysHelloWorld;

import java.util.SortedMap;

public class HelloWorld {
    public void main(String[] args) {
        System.out.println("Java Says Hello World");
        wordNameAppender("Martin");
        wordNameAppender("Sanchez");
        int x = add(20, 30);
        double y = add(23.22, 21.313);
        print(x);
        print(y);

    }

    static void myMethod() {
        System.out.println("This is my first method in Java");
    }

    static void print(int w) {
        System.out.println("The result is: " + w);
    }

    static void print(double x) {
        System.out.println("The result is: " + x);
    }

    static void print(String y) {
        System.out.println("The result is: " + y);
    }

    static void wordNameAppender(String name) {
        System.out.println("Blessings to " + name);
    }

    static int add(int x, int y) {
        return x + y;
    }

    static double add(double x, double y) {
        return x + y;
    }
}

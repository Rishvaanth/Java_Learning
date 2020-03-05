package com.example.JavaSaysHelloWorld;

public class HelloWorld {
    public static void main(String[] args) {
        System.out.println("Java Says Hello World");
        myMethod();
        wordNameAppender("Martin");
        wordNameAppender("Sanchez");
    }

    static void myMethod() {
        System.out.println("This is my first method in Java");
    }

    static void wordNameAppender(String name) {
        System.out.println("Blessings to " + name);
    }
}

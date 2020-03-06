package com.example.JavaSaysHelloWorld;

import java.util.Arrays;

class Class2 {
    static void main(String[] args) {
        Class1 object = new Class1();
//        HelloWorld object2 = new HelloWorld();
        int x = object.x;
        HelloWorld.print(x);
        HelloWorld.myMethod();
        HelloWorld.wordNameAppender("Jack");
        HelloWorld.print(object.a);
    }
}

package com.example.JavaSaysHelloWorld; ////Constructors with parameters

public class Class3 {
    int x = 6;
    int a;

    public Class3(int y) {
        a = y;
    }

    public static void main(String[] args) {
        Class3 obj = new Class3(7);
        HelloWorld.print(obj.a);
        System.out.println(obj.x);
    }
}

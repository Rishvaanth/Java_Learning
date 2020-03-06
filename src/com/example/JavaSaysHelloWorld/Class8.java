package com.example.JavaSaysHelloWorld;

public class Class8 {
    public static void main(String[] args) {
        Class7 newObj = new Class7();
        String x = newObj.getName();
        System.out.println(x);
        newObj.putName("The tides have turned");
        System.out.println(newObj.getName());
    }
}

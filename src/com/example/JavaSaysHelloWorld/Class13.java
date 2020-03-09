package com.example.JavaSaysHelloWorld;

public class Class13 {
    public static void main(String[] args) {
        int x = 10;
        int y = 0;
        try {
            x = x / y;
            System.out.println("Division is: " + x);
        } catch (Exception e) {
            System.out.println("Error: " + e);
        } finally {
            System.out.println("Errors were handled if they had existed");
        }
    }
}

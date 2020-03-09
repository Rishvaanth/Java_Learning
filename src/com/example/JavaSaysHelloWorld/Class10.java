package com.example.JavaSaysHelloWorld;

import java.util.Scanner;

public class Class10 {
    public static void main(String[] args) {
        Scanner myObj1 = new Scanner(System.in);
        System.out.println("Enter something");
        String text = myObj1.nextLine();
        System.out.println("You entered: " + text);
    }
}

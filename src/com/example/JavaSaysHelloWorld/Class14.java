package com.example.JavaSaysHelloWorld;

public class Class14 {
    public static void main(String[] args) {
        ageChecker(19);
        ageChecker(6);

    }

    static void ageChecker(int age) {
        if (age < 18) {
            throw new ArithmeticException("Access denied, You should be 18+ to vote");
        } else System.out.println("Eligible");
    }
}

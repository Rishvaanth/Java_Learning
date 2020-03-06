package com.example.JavaSaysHelloWorld;

public class Class4 {
    static void myStaticMethod() {
        System.out.println("Accessed Static Method Here!");
        System.out.println("Static method here");
    }

    public static void main(String[] args) {
        myStaticMethod();
        System.out.println("Cant call public method tho :( Gotta create an object to access that rascal ");

        Class4 newObj = new Class4();
        newObj.myPublicMethod();
        System.out.println("Public methods can be accessed by the objects of the class, I know its so wierd!!");
    }

    public void myPublicMethod() {
        System.out.println("Accessed Public Method");
        System.out.println("Public method here");
    }
}

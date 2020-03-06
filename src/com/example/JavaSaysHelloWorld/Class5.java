package com.example.JavaSaysHelloWorld;

abstract class Class5 {
    public int x = 5;
    public String y = "I Definitely am Having fun Learning these";

    public abstract void myfun();
}

class Class5x extends Class5 {
    public int year = 1212;

    public void myfun() {
        System.out.println("Here is an example of an abstract function in its natural habitat");
    }
}

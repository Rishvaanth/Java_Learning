package com.example.JavaSaysHelloWorld;

/*Polymorphism*/
class Class9 {
    public void Saythings() {
        System.out.println("ieufgiwhejc i uqwidhiuhwqui");
    }

}

class Saidthings extends Class9 {
    public void Saythings() {
        System.out.println("ygefiuguwqdoudhwo");
    }
}

class Willsaythings extends Class9 {
    public static void main(String[] args) {
        Class9 newObj = new Class9();
        newObj.Saythings();
        Saidthings newObj2 = new Saidthings();
        newObj2.Saythings();
        Willsaythings newObj3 = new Willsaythings();
        newObj3.Saythings();
    }

    public void Saythings() {
        System.out.println("uieg37gbiqudbwibd");
    }
}

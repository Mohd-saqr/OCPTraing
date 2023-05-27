package org.example.chapter3;

public class Main {

    public static void main(String[] args) {
        GenericClass<Number>genericClass = new GenericClass<>();
        genericClass.value=new Integer(10);
        genericClass.main();
    }
}

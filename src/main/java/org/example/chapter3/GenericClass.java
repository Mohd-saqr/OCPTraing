package org.example.chapter3;

public class GenericClass<T extends Number> {
    T value;


    public  void main( ) {
        System.out.println(value.toString());
    }

    public   <U extends Integer,V extends String>  void gMethod(U t,V v){

        System.out.println(t.intValue());
        System.out.println(v.concat("5"));

    }

//    public   <U super Integer,V extends String>  void gMethod(U t,V v){
//
//        System.out.println(t.intValue());
//        System.out.println(v.concat("5"));
//
//    }
}

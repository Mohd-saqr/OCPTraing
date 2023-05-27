package org.example.chapter2;

public interface Interface22 {

    static void test(){
        System.out.println("1");
    }

    default void testdefault(){
        System.out.println("1");
    }
}

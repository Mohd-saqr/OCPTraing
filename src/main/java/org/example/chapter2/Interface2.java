package org.example.chapter2;

import java.io.IOException;

public interface Interface2 {

    void exceptionMethod() throws Exception;
    void IoExceptionMethod() throws IOException;


    static void test(){
        System.out.println("2");
    }

    default void testdefault(){
        System.out.println("1");
    }
}

package org.example.chapter3;

import org.example.IO;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Arrays;
import java.util.List;

public class Bound {

    /**@paraminfo
     * upper bound and unbound in imutable
     * lower bound  mutable
     *
     *
     */


    public static void main(String[] args) {
        unBound(Arrays.asList("dfs", "sdfs"));
        unBound(Arrays.asList(2,3));

       /// ******************************************************
        UpperBound(Arrays.asList(1, 2));
        UpperBound(Arrays.asList(1L, 2L));
        UpperBound(Arrays.asList(new Float(10), 2L));
        lowerBound(Arrays.asList(new Exception("")));
        lowerBound(Arrays.asList(new IOException("")));
        lowerBound(Arrays.asList(new FileNotFoundException("")));
        lowerBound(Arrays.asList(new ClassCastException("")));
    }

 static   void  unBound(List<?> list){
        list.forEach(System.out::println);
    }


    static   void  UpperBound(List<? extends Number> list){
        list.forEach(System.out::println);
    }
    static   void  lowerBound(List<? super Exception> list){
        list.forEach(System.out::println);
    }



}

package org.example.chapter4;

import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class CollectResult {
    /**
     * to collect the result we have some methods first
     * averaging methods: all of them return double  Wraper class
     * averagingDouble calculate the average for double
     * averagingInt     calculate the average for int
     * averagingLong      calculate the average for Long
     */


    Stream<Number> stream = Stream.of(10,20,1.2,6,9);
    Stream<String> stream2 = Stream.of("1","2","3","4");

    Double averaging(int i){
        // ex
        return stream.collect(Collectors.averagingDouble(( r)->r.doubleValue()));
    }

    /**
     * counting :
     * count the number of element and return Long and do not take any things
     */

    Long counting(){
        return stream.collect(Collectors.counting());
    }


    /**
     * groupingBy :
     * create a map of spicific key and List Of T
     * we have three overload  methods
     * one take a function
     * one take function and collector
     * one take function and supplier and collector
     */


    <K,T> Map<Integer, List<Number>> groupingBy(){

        stream.collect(Collectors.groupingBy((Number n)->n.toString().length(),Collectors.toSet()));
        return stream.collect(Collectors.groupingBy((Number n)->n.toString().length()));
    }


    /**
     * Joining to string with diamelter we have tow overloaded methods
     * one not take any things and one thke a charSecunce
     */

    String joining(){
        return stream2.collect(Collectors.joining());
    }

    /**
     * minBy and max by return oprinal
     */



}

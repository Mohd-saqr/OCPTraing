package org.example.chapter4;

import java.sql.Connection;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamInterface {

    public static void main(String[] args) {
        StreamInterface streamInterface = new StreamInterface();
        streamInterface.terminalOperation();

        /**
         * creates Stream
         */

        Stream stream = Stream.empty();
        Stream stream1 = Stream.of();

    }


    /**
     * terminal Operation method
     */

    void terminalOperation(){


        Stream<String> stream = Stream.of("ts","gs","oo");






        // **if the stream empty return true**
       // System.out.println(stream.allMatch(i -> i<0));
      //  System.out.println(stream.noneMatch(integer -> integer<0));
        // if the stream empty return false
//        System.out.println(stream.anyMatch(integer -> integer>0));

      //  stream.collect(Collectors.toList()); // re varias
     //   stream.findFirst(); //re optinal
       // stream.findAny();//re optinal
       // stream.allMatch() // re boolean
      //  stream.noneMatch() // re bool
       // stream.anyMatch() // re bool
      //  stream.min(); optinal
      //  stream.max();optional
       // stream.reduce() re  result
        stream.count();/// long
    }

    /**
     * intermediate operation
     */

    void intermediateOpe(){
        Stream<Integer> stream = Stream.empty();
        //stream.filter()
        stream.distinct();
       // stream.map()
         //stream.flatMap()
    }





}

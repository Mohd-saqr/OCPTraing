package org.example.chapter4;

import java.util.stream.DoubleStream;
import java.util.stream.IntStream;
import java.util.stream.LongStream;

public class PrimitiveStream {

    public static void main(String[] args) {
        /**
         * range and range close not in double stream
         */
        IntStream stream = IntStream.range(1,5);
        IntStream stream2 = IntStream.rangeClosed(1,5);

       // LongStream longStream =LongStream.range()


    }



}

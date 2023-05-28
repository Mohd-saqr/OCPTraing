package org.example.chapter4;

import java.util.stream.DoubleStream;
import java.util.stream.IntStream;
import java.util.stream.LongStream;

public class PrimitiveStream {

    public static void main(String[] args) {
        /** @IMPORTANT
         * range and range close not in double stream
         *   we have three type of stream of LongStream and DoubleStream and IntStream
         *   to create primitive stream we have some method of and concat tak tow Intstream and generate take intSupplier
         *   we have some method to convert stream form type to another  type
         */
        IntStream stream = IntStream.range(1,5);
        IntStream stream2 = IntStream.rangeClosed(1,5);


       // LongStream longStream =LongStream.range()


    }



}

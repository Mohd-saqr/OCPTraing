package org.example.chapter4;

import java.util.Optional;
import java.util.OptionalDouble;
import java.util.OptionalInt;
import java.util.OptionalLong;

public class OptionalClass {

    /**
     *
     */


    public static void main(String[] args) {
        // of ,empty ,ofNullable
        Optional<Integer>integer =Optional.of(1);
        integer.get();// re value or throw
        integer.isPresent(); // re bool
        integer.ifPresent(System.out::println); // re void take consumer
        integer.orElseThrow(RuntimeException::new); // void take supplier t extends exception
        integer.orElse(10);// re value
        integer.orElseGet(() -> new Integer(120)) ; // re value supplier t extends t
       // integer.filter() re optinal t
        // integer.flateMap() re optinal of take function

    }

    /**
     * optional for primitive
     * OptionalLong for lone value
     * OptinalInt for int and char and short
     * OptinalDouble for double and float
     * to create jut wehave empty , of
     * does not have the fillter orflate map same optinal class
     */

    void optinalPrimitive(){

        OptionalDouble optionalDouble = OptionalDouble.of(4.6);
        optionalDouble.getAsDouble();
        OptionalLong optionalLong;
        OptionalInt optionalInt;
     //   optionalDouble.orElse(); re value
      //  optionalDouble.isPresent(); re boolean
     //   optionalDouble.ifPresent(); take DoubleFunction


    }

}

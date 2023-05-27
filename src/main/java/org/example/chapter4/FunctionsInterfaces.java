package org.example.chapter4;

import java.util.function.BiFunction;
import java.util.function.BinaryOperator;
import java.util.function.Function;
import java.util.function.UnaryOperator;
import java.util.stream.Stream;

public class FunctionsInterfaces {

    /**
     * Supplier its generic it does not take one parames and it will return value the method in this interface is:
     * T get()
     * Consumer it's generic interface in take one pram and does not return any value
     * void accept(t)
     * BiConsumer<T V> take tow and return void
     * void accept(t,v)
     * Predicate take one return boolean
     * boolean test()
     * BiPredicate <T,V> take too param and retrun boolean
     * boolean test(t v)
     * Function<T R> take one and return R it has compose method take an fuunction and idintity return same value and it
     * hase andThen method
     * R apply(T R)
     * BiFunction <T V R> taketowand return R
     * UnaryOperator <T> take one and return T
     *  T apply(T)
     * BinaryOperato<T T> take to and return T
     *  T apply(T T)
     */


    BiFunction biFunction;
    Function function;
    UnaryOperator unaryOperator3;
    BinaryOperator binaryOperator;

    public static void main(String[] args) {

    }

}

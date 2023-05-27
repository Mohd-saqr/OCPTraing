package org.example.chapter3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;

public class DataStructure {
    static List<Integer> integers = new ArrayList<>();


    public static void main(String[] args) {
        DataStructure dataStructure = new DataStructure();
        dataStructure.run();
//        dataStructure.print(integers);
    }


    private <T> void print(List<T> ts) {
        ts.forEach(System.out::println);
    }

    private void run() {

        // indexOutOfBoundException out of index
        integers.add(1);
        integers.add(2);
        integers.add(3);
        integers.add(4);
        integers.add(1, 2);
        integers.remove(new Integer(1)); // this method in colllection interface
//        integers.remove(1);
        integers.replaceAll(i -> ++i);
        integers.parallelStream();
        integers.set(6, 6); ///.IndexOutOfBoundsException
        print(integers);

      //  Arrays.sort(); just take an integer [] not list or object
        // also has method  take a comparator
    }
}

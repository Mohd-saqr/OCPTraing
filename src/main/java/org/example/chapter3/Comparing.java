package org.example.chapter3;

import org.example.User;

import java.util.Comparator;

public class Comparing implements Comparable<User>{
    /// the comparable has Conmpare to method return int and take one paraMETER
    /// we must implement the comparable
    // jav.lang.
    @Override
    public int compareTo(User o) {
        return 0;
    }


    /**
     * it has compare method and take tow params  and return and integer
     * not require implementation it
     * java.util
     */

    Comparator<User> tComparator = new Comparator<User>() {

        @Override
        public int compare(User o1, User o2) {
            return 0;
        }
    };
}

package org.example.chapter2;

import java.util.ArrayList;
import java.util.List;

public final class Immutable {
    private final  String name;
    private final  int age;

    private final List<String> marks ;

    public Immutable(String name, int age, List<String> marks) {
        this.name = name;
        this.age = age;
        this.marks = new ArrayList<>(marks); // in this way for prevent object reference access
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public List<String> getMarks() {
        return marks;
    }
}

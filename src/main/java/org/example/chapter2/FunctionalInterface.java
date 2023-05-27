package org.example.chapter2;
// @java.lang.FunctionalInterface not compile
public interface FunctionalInterface extends FunctionalInterface1,FunctionalInterface2 {

    /**
     * it must have one abustract method
     * @java.lang.FunctionalInterface not important
     * the override method in count for interface  this interface not compile decode we have to method one inherited and
     * y method the static method and default method not counted
     */

    abstract void y();
}

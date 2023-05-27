package org.example.chapter2;

public class InterfaceMethod implements Interface2,Interface22{

    /** @info
     * if you implement an method in interface and this method throws an exception it's fine to not throes it
     */
    @Override
    public void exceptionMethod() {

    }

    @Override
    public void IoExceptionMethod()    {

    }

    /*
    you must to Override becouse we have same method in tow interface
     */
    @Override
    public void testdefault() {
        Interface2.super.testdefault();
    }
}

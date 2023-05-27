package org.example.chapter2;

public class Singleton {
    /**
     * the Singleton in the design patters
     * the way tho create Singleton :
     * make the constructor private
     * create a finel and and private instacne of this class
     * create method to create return this instance static method and make the method synchronized , and we have to way to di that :
     *
     */


    private static    Singleton instance;

    public  static synchronized Singleton getInstance(){
        if (instance==null)
            instance =new Singleton();

        return instance;
    }

    private Singleton(){

    }


}

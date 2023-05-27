package org.example.chapter3;

import java.util.*;

public class DataStructureInterfaces {

    /** @ map interface
     * methods
     * put
     */



        List<Integer> list = new ArrayList<>();

        Deque<Integer> deque = new ArrayDeque<>();
        List<Integer> listLinked= new LinkedList<>();

    public static void main(String[] args) {
        DataStructureInterfaces dataStructureInterfaces = new DataStructureInterfaces();
        dataStructureInterfaces.Queueinterface();
    }


    /**
     * Collection interface Method
     */

    void CollectionInterface(){
        Collection<Integer> collection = new ArrayList<>();
        // boolean add(Object o )
        collection.add(1);
        // boolean remove(object o)
        collection.remove(new Integer(10));
        // boolean contains (Object o)
        collection.contains(new Integer(10));
        collection.isEmpty();
        collection.size(); // return int

        collection.clear(); //return void

    }

    /**
     * List Interface Methods
     */

    void ListInterface(){
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2,2); // return boolean
        list.lastIndexOf(new Integer(10)); // return int
        list.indexOf(new Integer(10));// re int
        list.get(1); // return obj
        list.remove(10); // return obj
    }


    /**+
     * Set Interface
     */


    void setMethods(){
        Set<Integer> integers1 = new HashSet<>();
        integers1.add(new Integer(10)); // bool
        integers1.remove(new Integer(10)); // bool
        integers1.contains(new Integer(10));

    }


    /**
     * NavigableSet interface
     */


    void NavigableSetMethod(){
        NavigableSet<Integer> integers1 = new TreeSet<>();

        integers1.floor(10); /// <=e
        integers1.lower(10); // <e
        integers1.higher(10);// >e
        integers1.ceiling(10); // >=e
    }


    /**
     * Queue Interface
     *  front [      ] back
     */

    void Queueinterface(){

        // boolean add (obj ) re or throw , add to the back
        Queue<Integer> queue = new ArrayDeque<>();
        queue.add(10);
        // boolean offer(obj) re , add to back
        queue.offer(20);
        System.out.println(queue);

        queue.element(); /// re obj or throw if empty , from the front
        queue.peek(); // re or null // from the front
        queue.remove(); /// re nexElement or throw if empty from the front
        queue.poll(); // re or null if empty fromthe front






    }


    /**
     * Map interface
     */

    void mapMethod(){
        Map<Integer ,Integer> map = new HashMap<>();

        map.put(10,10); // re previous value
        map.clear(); // void
        map.get(10);//  re value or null
        map.remove(10); // re  removeValue for the key or null
        map.remove(10,10) ;// re re  removeValue for the key or null if the value for the key
        map.containsKey(10); // re boolean;
        map.containsKey(10); //re boolean


    }


}

package com.java.collections;

import java.util.ArrayList;
import java.util.Collection;

public class CollectionInterfaceMethods {

    public static void main(String[] args) {

        /**
         * Collection interface is ROOT Interface of Collection Framework
         * Collection Interface defines the most common methods which are applicable for any collection object
         */


        Collection<String> object = new ArrayList<>();

        // add method
        object.add("Java");
        object.add("Selenium");
        object.add("APi");

        System.out.println(object);

    }

}

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

        // add() method. You can add a Collection object to it
        object.add("Java");
        object.add("Selenium");
        object.add("API");

        System.out.println("Collection itself -> " + object);

        // addAll(). You can add whole Collection
        // first we need a different object for it

        Collection<String> companies = new ArrayList<>();
        companies.add("Apple");
        companies.add("Microsoft");

        object.addAll(companies);

        System.out.println("Collection after added new  collection -> " + object);

    }

}

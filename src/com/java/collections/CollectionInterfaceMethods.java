package com.java.collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;

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
        // printing the initial object
        System.out.println(object);

        // addAll(). You can add whole Collection
        // first we need a different collection for it
        Collection<String> companies = new ArrayList<>();

        // adding elements to the collection
        companies.add("Apple");
        companies.add("Microsoft");

        // adding the companies object to the object one
        object.addAll(companies);

        // printing the object object after adding the companies
        System.out.println(object);

        //removeAll(); and it returns boolean. It removes all the elements of specified collection
        System.out.println(object.removeAll(companies));

        // printing out the companies object after removing  the companies object
        System.out.println(object);

        // retainAll(); it keeps only wanted object
        // adding the companies object to object again
        System.out.println(object.addAll(companies));
        // printing the object again and expected outcome is both object and companies printed out
        System.out.println(object);
        // Now, we want to retain only the companies object
        System.out.println(object.retainAll(companies));
        // printing the object after retaining the companies object
        System.out.println(object);

        // isEmpty(); method check if the collection empty or not and return boolean
        // Since object is not empty, it returns false
        System.out.println(object.isEmpty());

        // contains(Object c) checking if it contains that particular collection
        // because companies object is removed from the object contains() method returns false
        System.out.println(object.contains(companies));

        // containsAll(Collection c) methods check if multiple collections there are in the
        // creating another and object and adding it to the collecions
        Collection<String> laptops = new ArrayList<>();
        // adding elements to the collection
        laptops.add("MacBook Pro");
        laptops.add("Dell");
        laptops.add("Lenovo");
        laptops.add("HP");
        // Also, contains() method check if the single element is visible in the Object
        System.out.println("Testing if the element is contained: " + laptops.contains("MacBook Pro"));

        object.addAll(laptops);
        System.out.println(object.containsAll(object));

        // c.toArray(); converting list of Object to Array
        Object[] conversion = laptops.toArray();
        System.out.println("Object is converted to the Array -->> " + Arrays.toString(conversion));

        // size(); method gives us the size of the Object
        System.out.println(laptops.size());

        // iterator(); methods iterate the elements of the Object
        Iterator iterator = laptops.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
}

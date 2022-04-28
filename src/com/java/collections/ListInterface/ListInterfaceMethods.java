package com.java.collections.ListInterface;

import java.util.ArrayList;
import java.util.List;

public class ListInterfaceMethods {

    public static void main(String[] args) {

        /**
         * 1. It is child interface of Collection
         * 2. Index is helping us to identify the duplicates
         * 3. Duplicate is allowed
         * 4. List inherit all the methods form Collection Interface
         */

        List<Integer> grades = new ArrayList<Integer>();

        // adding elements to the list
        grades.add(5);
        grades.add(10);

        // adding the elements into the specific index
        grades.add(1, 3);

        // getting the index of the element
        System.out.println(grades.indexOf(5));
        //  checking if the list is empty
        System.out.println(grades.isEmpty());
        // checking if the list contains element 5
        System.out.println(grades.contains(5));
        //
        System.out.println(grades.listIterator(1).nextIndex());
        System.out.println(grades.listIterator(1).hasNext());
        System.out.println(grades.listIterator(1).previousIndex());

        System.out.println(grades);
    }
}

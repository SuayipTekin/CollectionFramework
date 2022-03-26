package com.java.collections;

import java.util.ArrayList;
import java.util.Arrays;

public class NeedOfJavaCollection {

    public static void main(String[] args) {

        int [] sampleArr = new int[5];

        sampleArr[0]=5;
        sampleArr[1]=5;
        sampleArr[2]=7;
        sampleArr[3]=15;
        sampleArr[4]=10;

        System.out.println(Arrays.toString(sampleArr));


        /**
         *
         * Disadvantage of Array;
         * 1. Array size is fixed and if I put less value than size of the array,
         *    rest of the memory will be wasted.
         * 2. ARRAYS IS NOT GROWABLE IN NATURE
         * 3. We can only store same type of data in array
         * 4. ARRAYS ARE NOT IMPLEMENTED BY USING ANY UNDERLYING DATA STRUCTURE
         *    (IT DOES NOT USE READY METHOD)
         *
         */


        int a = 40;
        int b = 20;
        int c = 30;

        int[] arr = {a, b, c};

        Arrays.sort(arr);

        System.out.println(Arrays.toString(arr));

/**
 * ARRAYS                                     COLLECTION
 * ______                                     ----------
 * Array is fixed size                        Growable
 * Arrays hold homogenises data               Homogenises and Hetrogenies
 *
 */


    }
}

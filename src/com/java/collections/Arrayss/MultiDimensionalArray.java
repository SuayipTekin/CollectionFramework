package com.java.collections.Arrayss;

import javax.naming.PartialResultException;
import java.util.Arrays;

public class MultiDimensionalArray {

    public static void main(String[] args) {

        // 2-dimensional arrays: Matrix or table
        // In the Java multidimensional array is array of the Array

        // Arrays of Arrays (Jagged Arrays)
        // 2 dimensional array
        int[][] arr = new int[2][];
        arr[0] = new int[2];
        arr[1] = new int[3];

        // 3 dimensional array
        // parent array size is 2
        int[][][] arr3 = new int[2][][];
        // 1st child array size is 3
        arr3[0] = new int[3][];
        // first child of child array size is 1
        arr3[0][0] = new int[1];
        // second child of child array size is 2
        arr3[0][1] = new int[2];
        // third child of child array size is 3
        arr3[0][2] = new int[3];

        // 2nd child of array size is 2
        arr3[1] = new int[2][2];


        int[] x = new int[3];
        System.out.println(x); // prints hashcode ([I@1540e19d)
        System.out.println(x[0]); // result 0
        System.out.println(Arrays.toString(x)); // result [0, 0, 0]
        System.out.println(x.toString()); // it prints hashcode that we do not expect ([I@1540e19d)

        int[][] x1 = new int[3][2];
        System.out.println(x1[0][0]); // result 0

        int[][] x2 = new int[3][];
//        System.out.println(x2[0][0]); // Exception in thread "main" java.lang.NullPointerException
                                      // Because size is not specified for child array that is why
                                      // object is not created in the memory

        int[] arr4 = new int[4];
        System.out.println(Arrays.toString(arr4)); // [0, 0, 0, 0]

        arr4[0] = 10;
        arr4[1] = 20;
        arr4[2] = 30;
        arr4[3] = 40;
        System.out.println(Arrays.toString(arr4)); // [10, 20, 30, 40]

//        arr4[4] = 50;
        System.out.println(Arrays.toString(arr4)); // Runtime Exception in thread "main" java.lang.ArrayIndexOutOfBoundsException

        arr4[-4] = 50;
        System.out.println(Arrays.toString(arr4)); // Runtime Exception in thread "main" java.lang.ArrayIndexOutOfBoundsException

    }

}

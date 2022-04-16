package com.java.collections.Arrayss;

public class ArraysIntroduction {

    public static void main(String[] args) {

        // This is the long way to store the value into multiple variables.
        // Instead, we can use single variable with array and store the values there.
        int a = 12;
        int b = 13;
        int c = 14;

        // we can specify the size for the array, but we cannot change the size
        // And we can only use int values for the following array
        // new is creating new array object
        int [] arr = new int[1000];

        // There are array classes for each data types
        System.out.println(arr.getClass().getName());

        // we have to provide the array size when we create the object/
        // Following code will give a compiler error
        // int [] arr1 = new int[];

        // You can provide 0 to array size, and it will work
        int [] arr2 = new int[0];

        // We can provide char to array size ant it will work
        // Because, char will be converted to the int.
        // Also, byte, short and int can be used for the size of the array
        int [] arr3 = new int['c'];

        //We  cannot give negative value to array size.
        // It does not give  compiler error but there will be a run time error.
        int [] arr4 = new int[-1];

        // Array does not take large number because
        // There is limit for the array size
        // Following code will give an error
//        int [] x = new int[12435555577];






    }
}

package cs1302.sorting;

import java.io.*;
import java.util.*;

/**
 * Class for SelectionSort.
 */
public class SelectionSort {

    public static void main(String[] args) {
        Integer[] intArray = {2, 3, 1, 4, 5};
        System.out.println(Arrays.toString(intArray)); // [ 2, 3, 1, 4, 5 ] 
        selectMin(intArray, 0, 4, Integer::compareTo);
        System.out.println("hi: 4 , lo: 0");
        System.out.println(Arrays.toString(intArray)); // [ 1, 3, 2, 4, 5 ]  
        System.out.println("The swapping of adjacent Integer elements for the indexes, 0-1, "
                           + "that are not in order, until the list is in order.");

        System.out.println();
        Double[] doubleArray = {2.2, 3.3, 1.1, 4.4, 5.5};
        System.out.println(Arrays.toString(doubleArray)); // [ 2.2, 3.3, 1.1, 4.4, 5.5 ] 
        selectMin(doubleArray, 0, 4, Double::compareTo);
        System.out.println("hi: 4, lo: 0");
        System.out.println(Arrays.toString(doubleArray)); // [ 1.1, 2.2, 3.3, 4.4, 5.5 ]  
        System.out.println("The swapping of adjacent Double elements for the indexes, 0-4, "
                           + "that are not in order, until the list is in order.");

        System.out.println();
        String[] stringArray = {"a", "c", "b"};
        System.out.println(Arrays.toString(stringArray));
        selectMin(stringArray, 0, 2, String::compareTo);
        System.out.println("hi: 2, lo: 0");
        System.out.println(Arrays.toString(stringArray));
        System.out.println("The swapping of adjacent String elements for the indexes, 0-2, "
                           + "that are not in order, until the list is in order.");
    } // main 
    
    /**             
     * selectMin that iterates over array from index's and swaps
     * minimum value to lo position.  
     *    
     * @param <T> type used in array      
     * @param array array that is being bubble'd   
     * @param lo lowest index to find the minimum    
     * @param hi highest index to find the minimum 
     * @param c comparator used in method   
     */
    public static <T> void selectMin(T[] array, int lo, int hi, Comparator<T> c) {
	T lowest = null;
        for (int i = lo; i < hi; i++) {
            if (c.compare(array[i], array[i + 1]) < 0) {
                lowest = array[i + 1];
                //array[i] = array[i + 1];
                //array[i + 1] = temp;
            } // if      
        } // for  
	System.out.println(lowest);
    } // selectMin  
} // SelectionSort

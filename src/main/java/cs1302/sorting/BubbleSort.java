package cs1302.sorting;

import java.io.*;
import java.util.*;

/**
 * Class for BubbleSort.
 */
public class BubbleSort {

    public static void main(String[] args) {
        Integer[] intArray = {5, 4, 2, 3, 1};
        System.out.println(Arrays.toString(intArray)); // [ 5, 4, 3, 2, 1 ]
        bubbleSort(intArray, 0, 4, Integer::compareTo);
        System.out.println("hi: 4 , lo: 0");
        System.out.println(Arrays.toString(intArray)); // [ 1, 2, 3, 4, 5 ]
        System.out.println("The swapping of adjacent Integer elements for the indexes, 0-1, "
                           + "that are not in order, until the list is in order.");
                           
        System.out.println();
        Double[] doubleArray = {2.2, 3.3, 1.1, 4.4, 5.5};
        System.out.println(Arrays.toString(doubleArray)); // [ 2.2, 3.3, 1.1, 4.4, 5.5 ]      
        bubbleSort(doubleArray, 0, 4, Double::compareTo);
        System.out.println("hi: 4, lo: 0");
        System.out.println(Arrays.toString(doubleArray)); // [ 1.1, 2.2, 3.3, 4.4, 5.5 ]
        System.out.println("The swapping of adjacent Double elements for the indexes, 0-4, "
                           + "that are not in order, until the list is in order.");
                           
        System.out.println();
        String[] stringArray = {"a", "c", "b"};
        System.out.println(Arrays.toString(stringArray));  
        bubbleSort(stringArray, 0, 2, String::compareTo);
        System.out.println("hi: 2, lo: 0");
        System.out.println(Arrays.toString(stringArray));
        System.out.println("The swapping of adjacent String elements for the indexes, 0-2, "
                           + "that are not in order, until the list is in order.");
    } // main


    /**
     * Method that bubble sorts an array of a certain type.
     *
     * @param <T> types used in array
     * @param array array that is being sorted
     * @param lo the lowest index for sorting
     * @param hi the highest index for sorting
     * @param c comparator used in method
     */
    public static <T> void bubbleSort(T[] array, int lo, int hi, Comparator<T> c) {
        int count = 0;
        
        for (int i = lo; i < hi - lo; i++) {
            bubble(array, lo, hi - count, c);
            count++;
        }
    } //bubbleSort
    
    /**
     * Bubble alog that iterates over array from index's and swaps adjacent elements.
     *
     * @param <T> type used in array
     * @param array array that is being bubble'd
     * @param lo lowest index to be bubble'd
     * @param hi highest index to be bubble'd
     * @param c comparator used in method
     */
    public static <T> void bubble(T[] array, int lo, int hi, Comparator<T> c) {
        for (int i = lo; i < hi; i++) {
            if (c.compare(array[i], array[i + 1]) > 0) {
                T temp = array[i];
                array[i] = array[i + 1];
                array[i + 1] = temp;
            } // if
        } // for
    } // bubble
    

    
} // BubbleSort

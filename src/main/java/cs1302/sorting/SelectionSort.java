package cs1302.sorting;

import java.io.*;
import java.util.*;
import java.lang.*;

/**
 * Class for SelectionSort.
 */
public class SelectionSort {

    public static void main(String[] args) {
        Integer[] intArray = {2, 3, 1, 4, 5};
        System.out.println(Arrays.toString(intArray)); // [ 2, 3, 1, 4, 5 ] 
        selectSort(intArray, 0, 4, Integer::compareTo);
        System.out.println("hi: 4 , lo: 0");
        System.out.println(Arrays.toString(intArray)); // [ 1, 3, 2, 4, 5 ]  
        System.out.println("The swapping of then minimum value in the array to the lo position, "
                           + "from 0 - 4");
        System.out.println();
        Double[] doubleArray = {1.1, 3.3, 2.2, 4.4, 5.5};
        System.out.println(Arrays.toString(doubleArray)); // [ 1.1, 3.3, 2.2, 4.4, 5.5 ] 
        selectSort(doubleArray, 1, 4, Double::compareTo);
        System.out.println("hi: 4, lo: 1");
        System.out.println(Arrays.toString(doubleArray)); // [ 1.1, 2.2, 3.3, 4.4, 5.5 ]  
        System.out.println("The swapping of then minimum value in the array to the lo position, " 
                           + "from 1 - 4.");
        System.out.println();
        String[] stringArray = {"c", "b", "a"};
        System.out.println(Arrays.toString(stringArray));
        selectSort(stringArray, 0, 2, String::compareTo);
        System.out.println("hi: 2, lo: 0");
        System.out.println(Arrays.toString(stringArray));
        System.out.println("The swapping of then minimum value in the array to the lo position, "
                           + "from 0 - 2.");
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
        T lowest = array[lo];
        int mindex = lo; 
        for (int i = lo; i < hi; i++) {
            if (c.compare(array[mindex], array[i + 1]) > 0) {
                mindex = i + 1;
            } // if      
        } // for

        T temp = array[lo];
        array[lo] = array[mindex];
        array[mindex] = temp;
        
    } // selectMin

     /**
     * Method that select sorts an array of a certain type.
     *
     * @param <T> types used in array
     * @param array array that is being sorted
     * @param lo the lowest index for sorting
     * @param hi the highest index for sorting
     * @param c comparator used in method
     */
    public static <T> void selectSort(T[] array, int lo, int hi, Comparator<T> c) {
        for (int i = lo; i < hi; i++) {
            selectMin(array, i, hi, c);
        } //for
    } //selectSort

} // SelectionSort

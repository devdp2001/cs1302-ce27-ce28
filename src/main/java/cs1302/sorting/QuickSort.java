package cs1302.sorting;

import java.io.*;
import java.util.*;
import java.lang.*;

/**                          
 * Class for QuickSort.                                          
 */
public class QuickSort {

    public static void main(String[] args) {
        Integer[] intArray = {1, 3, 2, 4, 5};
        System.out.println(Arrays.toString(intArray)); // [ 1, 3, 2, 4, 5 ]           
        int newPivotInt = partition(intArray, 0, 2, 4, Integer::compareTo);
        System.out.println(Arrays.toString(intArray)); // [ 1, 2, 5, 4, 3 ]     
        System.out.println(newPivotInt);

        System.out.println();
        Double[] doubleArray = {1.1, 3.3, 2.2, 4.4, 5.5};
        System.out.println(Arrays.toString(doubleArray)); // [ 1.1, 3.3, 2.2, 4.4, 5.5 ]     
        int newPivotDouble = partition(doubleArray, 0, 1, 4, Double::compareTo);
        System.out.println(Arrays.toString(doubleArray)); // [ 1.1, 2.2, 3.3, 4.4, 5.5 ]
        System.out.println(newPivotDouble);
    } // main                                                              

    /**                                                                    
     * Partition method.
     *                                                                     
     * @param <T> type used in array                                         
     * @param array array that is being bubble'd                            
     * @param lo lowest index to find the minimum
     * @param pivot the integer for the pivot                  
     * @param hi highest index to find the minimum             
     * @param c comparator used in method                 
     * @return int for the new pivot
     */
    public static <T> int partition(T[] array, int lo, int pivot, int hi, Comparator<T> c) {
        int i = lo;
        T temp = array[pivot];
        array[pivot] = array[hi];
        array[hi] = temp;
        
        // int i = lo;
        for (int  j = lo; j < hi - 1 ; j++) {
            if (c.compare (array[j], array[hi]) < 0) {
                temp  = array[i];
                array[i] = array[j];
                array[j] = temp;
                i++;
            }   
        }
        temp = array[i];
        array[i] = array[hi];
        array[hi] = temp;
        
        return i;
    }
} // partition

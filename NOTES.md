# Notes

## Bubble Sort Algo

```java
void bubble(array, lo, hi, c) {
    // n-1
        for (int i = lo; i < hi; i++) { -----------------------\
            if (c.compare(array[i], array[i + 1]) > 0) {
                T temp = array[i];
                array[i] = array[i + 1];
                array[i + 1] = temp; ----------------------> 1  | n-1
            } // if -------------------------------------------/
        } // for  
} // bubble
```

```java
void bubbleSort(array, lo, hi, c)
    // (n-1)^2
    int count = 0;

    for (int i    = lo; i < hi - lo; i++) { -------------\
       bubble(array, lo, hi - count, c);  ---------> n-1 | n-1 = (n-1)^2 
       count++;	     	      	     	  	           
    } ---------------------------------------------------/
} // bubble
```

## Selection Sort Algo

```java
void selectMin(array, lo, hi, c) {
    // REMEMBER, n = hi - lo + 1
        T lowest = array[lo];
        int mindex = lo; 
        for (int i = lo; i < hi; i++) { --------------------------------\
            if (c.compare(array[mindex], array[i + 1]) > 0) { ------> 1 | (n-l)^2
                mindex = i + 1;
            } // if      
        } // for

        T temp = array[lo];
        array[lo] = array[mindex];
        array[mindex] = temp; -----------------------------------------/
} // selectMin
```

```java
void selectionSort(array, lo, hi, c)
    // REMEMBER, n = hi - lo + 1
        for (int i = lo; i < hi; i++) { -----------------\
            selectMin(array, i, hi, c); -------> (n-1)^2 | (n-1)^3
        } //for -----------------------------------------/
} // selectionSort
```
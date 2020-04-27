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

## Partition Algo

```java
void partition(array, lo, pivot, hi, c) {
    // REMEMBER, n = hi - lo + 1
Swap:
        int i = lo;
        T temp = array[pivot]; ------------ 1 |
        array[pivot] = array[hi]; --------- 1 |
        array[hi] = temp; ----------------- 1 |

        // int i = lo;                                
        for (int  j = lo; j < hi - 1 ; j++) { ----------------------\
            if (c.compare (array[j], array[hi]) < 0) {
                temp  = array[i]; -------------------------------- 1 |
                array[i] = array[j]; ----------------------------- 1 |(hi - lo - 1) -> T(n)
                array[j] = temp; --------------------------------- 1 |
                i++;
            }
        } -----------------------------------------------------------/
        temp = array[i]; ----------------------------------------- 1 |
        array[i] = array[hi]; ------------------------------------ 1 |
        array[hi] = temp; ---------------------------------------- 1 |

        return i;

} // partition

Swap:
T(n) <= (hi - lo - 1)(3) + b
Since n <= hi - lo - 1, T(n) <= 3(n-2) + 6


void partition(array, lo, pivot, hi, c) {
    // REMEMBER, n = hi - lo + 1
Comparison:
        int i = lo;
        T temp = array[pivot];
        array[pivot] = array[hi];
        array[hi] = temp;

        // int i = lo;
        for (int  j = lo; j < hi - 1 ; j++) { ----------------------\
            if (c.compare (array[j], array[hi]) < 0) { ---------- 1 | (hi - lo - 1) = T(n)
                temp  = array[i];
                array[i] = array[j];
                array[j] = temp;
                i++;
            }
        } ----------------------------------------------------------/
        temp = array[i]; 
        array[i] = array[hi];
        array[hi] = temp;
	
        return i;
	
} // partition

Comparison:
T(n) = 1 * (hi - lo - 1)
Since n = hi - lo + 1, T(n) = 1 * (n-2)
```
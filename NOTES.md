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
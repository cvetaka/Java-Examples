package While.Array;

import java.lang.reflect.Array;
import java.util.Arrays;

public class ArraySort {
    public static void main(String[] args) {
        int array[] = {55,66,3,52,6,82,68,1};
        int size = array.length;
        Arrays.sort(array);
        System.out.println("Size of array: "+ Arrays.toString(array));
    }
    }

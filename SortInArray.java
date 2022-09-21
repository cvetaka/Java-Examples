package While.Array;

import java.util.Arrays;

public class SortInArray {
    public static void main(String[] args) {
        int array[] = {3,4,1,2,6,4,8};
        int size = array.length;
        Arrays.sort(array);
        System.out.println("array length: "+size);
        System.out.println("sort array: "+ Arrays.toString(array));

    }
}

package While.Array;

import java.util.Arrays;

public class RatioInArray {
    //create an algorithm that display the ratio between the first element and the largest element store in array
    public static void main (String args[]) {
        int array[] = {22,45,3,66,7,11};
        int size = array.length;
        Arrays.sort(array);
        System.out.println("Sorted array:"+Arrays.toString(array));
        double res = array[size-1];
        double rem = array[0];
        double ratio = (rem)/ (res);
        System.out.println("Largest element is:"+res);
        System.out.println("Smallest element is:"+rem);
        System.out.println("Ratio :" + (ratio));
    }}
package Arrays.ReverseArray;

import java.util.Arrays;

public class ReverseArray {
    public static int[] reverseArray(int[] arr) {
        // code here
        int n = arr.length;
        int temp = 0;
        for (int i = 0; i < n / 2; i++) {
            temp = arr[i];
            arr[i] = arr[(n - 1) - i];
            arr[(n - 1) - i] = temp;
        }return arr;
    }
    public static void main(String[] args) {
        int[] arr = {2,3,4,5};
        int[] myArr = reverseArray(arr);
        System.out.println(Arrays.toString(myArr));
    }
}

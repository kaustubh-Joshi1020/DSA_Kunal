package com.kj;

public class max_val_inrange {
    public static void main(String[] args) {
        int[] arr = {1,6,3,8,3,2};
        System.out.println(max(arr , 2,5));  // this statement says run the max function on arr
    }

    static int max(int[] arr , int start , int end)
    {
        int maxval = arr[start];
        for (int i = arr[start]; i <= end; i++) {
            if (arr[i] > maxval) {
                maxval = arr[i];
            }
        }
        return maxval;
    }
}

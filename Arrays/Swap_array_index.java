package com.kj;

import java.util.Arrays;

public class Swap_array_index {
    public static void main(String[] args) {
        int arr[] = {1,5,3,8,7,9,4};
        System.out.println(Arrays.toString(arr)); // this is old array.
        swap(arr,3,2);
        System.out.println(Arrays.toString(arr));// this is new array.
    }
    static void swap(int[] mrr , int index1 , int index2)
    {
        int temp;
        temp = mrr[index1];
        mrr[index1] = mrr[index2];
        mrr[index2] = temp;
    }
}

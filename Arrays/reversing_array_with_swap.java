package com.kj;

import java.util.Arrays;

public class reversing_array_with_swap {
    public static void main(String[] args) {     //  this is a two pointer method
        int arr[] = {5,3,2,6,1,7};
        reverse(arr);
        System.out.println(Arrays.toString(arr));
    }

   static void reverse(int arr[])
   {
       int start = 0;
      int end = arr.length -1 ;

      while (start < end)
      {
          swap(arr,start,end);
          start++;
          end--;
      }

   }

    static void swap(int[] arr, int one , int another)
    {
        int temp;
        temp = arr[one];
        arr[one] = arr[another];
        arr[another] = temp;
    }

}

package com.kj;

public class maximum_val_inarray {
    public static void main(String[] args) {
        int[] arr = {1,6,3,8,3,2};
        System.out.println(max(arr));  // this statement says run the max function on arr
        }

        static int max(int[] arr)
        {
            int maxval = arr[0];
            for (int i = 0; i < arr.length; i++) {
                if (arr[i] > maxval) {
                    maxval = arr[i];
                }
            }
            return maxval;
        }
    }


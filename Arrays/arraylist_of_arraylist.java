package com.kj;

import java.util.ArrayList;
import java.util.Scanner;

public class arraylist_of_arraylist {
    public static void main(String[] args) {
        ArrayList<ArrayList<Integer>> arrlst = new ArrayList<>();
        Scanner input = new Scanner(System.in);

        for (int i = 0; i < 3; i++) {
            arrlst.add(new ArrayList<>());//here arraylists are created initially.
        }

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                arrlst.get(i).add(input.nextInt());
            }
        }
        System.out.println(arrlst);
    }
}

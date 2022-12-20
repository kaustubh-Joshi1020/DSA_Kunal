package com.kj.Collections;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Integer> arrayList= new ArrayList<>();
        List<String> arrayList1= new ArrayList<>();
        List<Float> floats = new ArrayList<>();

        for (int j = 0; j < 10; j++) {

            for (int i = 0; i < j-1; i++) {
                arrayList.add(i);
            }
        }
        //        arrayList.add(12);
        System.out.println(arrayList);

        System.out.println(arrayList.isEmpty());
        arrayList1.add("kaustubh");
        arrayList1.add("Joshi");
        System.out.println(arrayList1);

        floats.add(11.11f);

    }
}

package com.kj;

import java.util.Scanner;

public class NestedSwitch {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("enter the employee id:");
        int empid = input.nextInt();

        System.out.print("enter the enroll number:");
        int enroll_no = input.nextInt();


        switch(empid){
            case 1 -> System.out.println("this is nirav");

            case 2 -> System.out.println("this is aniket");

            case 3 -> {
                System.out.println("this is another employee");
                switch (enroll_no)
                {
                case 1 -> System.out.println("thoda paisa hai");
                case 2 -> System.out.println("medium paisa hai");
                case 3 -> System.out.println("bohot paisa hai!!");
                default -> System.out.println("enter a valid choice");
                }
                      }
            default-> System.out.println("enter the correct value");





        }

    }
}

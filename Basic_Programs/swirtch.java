package com.kj;

import java.util.Scanner;

public class swirtch {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("enter the number of the day:");
        int day  = input.nextInt();

        switch (day) {
            case 1, 2, 3, 4, 5, 6 -> System.out.println("working day");
            case 7 -> System.out.println("weekend!!!!");
            default -> System.out.println("enter a valid choice");
        }

    }
    }

//    Scanner input = new Scanner(System.in);
//  System.out.print("enter a fruit name:");
//          String fruit = input.next();
//
//
//          switch (fruit) { // this is enhanced switch case.
//          case "mango" -> System.out.println("king of all fruits");
//          case "orange" -> System.out.println("its a oranege fruit ");
//          case "grapes" -> System.out.println("sweet fruit");
//default -> System.out.println("enter a valid name");


// switch (fruit){
//         case "mango":
//         System.out.println("king of all fruits");
//         break;
//
//         case "orange":
//         System.out.println("its a oranege fruit ");
//         break;
//
//         case "grapes":
//         System.out.println("sweet fruit");
//         break;
//
//         default:
//         System.out.println("enter a valid name");
//         break;
import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

public class palidrome {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("enter number");
        int num = input.nextInt();
        int original = num;

        int ans = 0;

        while(num > 0)
        {
            int rem  = num % 10 ; // num modulo 10 is storing in remainder
            num = num /10;       // dividing num by 10 in loop
            ans = ans * 10 + rem; // multiplying answer by 10 then adding remainder
        }
        if (ans == original){
            System.out.println("it is palidrome");
        }
        else
        {
            System.out.println("it is not palidrome");
        }
//        System.out.println(ans);

    }
}

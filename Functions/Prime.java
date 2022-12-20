import com.sun.security.jgss.GSSUtil;

import java.util.Scanner;

public class Prime {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num = input.nextInt();
        boolean ans =  isprime(num);
        System.out.println(ans);
    }

    static boolean isprime(int num)
    {
        if (num <=1)
        {
            return false;
        }
        int i= 2;
        while (i*i <=num)
        {
            if (num % i == 0){
                return false;
            }
        }
        return i * i > num;
    }



    }


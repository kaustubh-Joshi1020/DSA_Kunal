import java.util.Scanner;

public class functionArguments {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("enter the first number:");
        int num1 = input.nextInt();
        System.out.print("enter the second number:");
        int num2  = input.nextInt();

        int print = addition(num1 , num2);
        System.out.println("the sum is:"+print);
    }
    static  int addition(int a , int b){
       int sum = a+ b;
       return sum;

    }
}

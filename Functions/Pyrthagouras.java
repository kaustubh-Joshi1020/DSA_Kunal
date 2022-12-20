import java.util.Scanner;

public class Pyrthagouras {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("enter the first number:");
        int a  = input.nextInt();

        System.out.print("enter the second number:");
        int b  = input.nextInt();

        System.out.print("enter the third number:");
        int c  = input.nextInt();

        int square1 = a*a;
        int square2 = b*b;
        int sum = square1+ square2;
        int square3 = c*c;

        if (sum == square3){
            System.out.println("it is tuple ");
        }
        else
        {
            System.out.println("not tuple");
        }








    }
}

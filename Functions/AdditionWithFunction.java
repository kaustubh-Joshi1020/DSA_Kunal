import java.util.Scanner;

public class AdditionWithFunction {
    public static void main(String[] args) {

            sum();

    }
    static void sum(){
        int a,b,sum;
        Scanner input = new Scanner(System.in);

        System.out.print("enter the first number:");
        a = input.nextInt();
        System.out.print("enter the second number:");
        b = input.nextInt();

        sum = a+ b;
        System.out.println(sum);



    }
}


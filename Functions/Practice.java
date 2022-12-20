import java.util.Scanner;

public class Practice {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("enter a number:");
        int a = input.nextInt();
        int original = a;
        int store = 0;

        while (a>0){
            int remainder = a %10;
            a = a/10;
            store = store + remainder*remainder*remainder;
        }
        if (store==original){
            System.out.println("it is  armstrong no");
        }
        else{
            System.out.println("it is not armstrong");
        }





//        System.out.println(armstrong(a));
//        for (int i = 0; i < 10000; i++) {
//            if(armstrong(i)){
//                System.out.print(i + "  ");
//            }

        }


//   static boolean armstrong(int a){
//        int original = a;
//        int store = 0;
//        while (a>0){
//            int remainder = a %10;
//            a = a/10;
//            store = store + remainder*remainder*remainder;
//        }
//         return store==original;

//    }
}

package biny;
//
//import java.util.Scanner;
//
//public class fibnocci {
//    public static void main(String[] args) {
//        //Q find fibnocci numbers
//        Scanner in=new Scanner(System.in);
//
//        int n, a=0,b=0,c=1;
//        System.out.println("Enter any value:");
//        n=in.nextInt();
//// using while loop
//        int i=1;
//        while (i<=n){
//            a=b;
//            b=c;
//            c=a+b;
//
//            i++;
//            System.out.println(a);
//        }
//
////        for(int i=1;i<=n;i++){
////            a=b;
////            b=c;
////            c=a+b;
////            System.out.println(a);
////        }
//
//
//
//        }
//
//    }
//


public class FibonacciCalc {
    public static int fibRecursion(int count) {
        if (count == 0) {
            return 0;
        }

        if (count == 1 || count == 2) {
            return 1;
        }         return fibRecursion(count - 1) + fibRecursion(count - 2);
    }

    public static void main(String args[]) {
        int fib_len = 9;

        System.out.print("Fibonacci Series of " + fib_len + " numbers is: \n");

        for (int i = 0; i < fib_len; i++) {
            System.out.print(fibRecursion(i) + " ");
        }
    }
}



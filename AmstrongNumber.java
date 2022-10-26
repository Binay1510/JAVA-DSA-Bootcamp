package modfunc;

import java.util.Scanner;

public class AmstrongNumber {
    public static void main(String[] args) {
//        Scanner in = new Scanner(System.in);
//        int n=in.nextInt();
//        boolean ans=isPrime(n);
//        System.out.println(ans);

        for (int i = 100; i <1000 ; i++) {
            if (isAmsrtong(i)){
                System.out.println(i);
            }

        }
//        System.out.println(isAmsrtong(n));
    }

    static boolean isAmsrtong(int n){
        int original=n;
        int sum=0;

        while(n>0){
            int rem=n % 10;
            n = n/10;
            sum=sum+rem*rem*rem;

        }
        return sum==original;
    }

}

package assign;

import java.util.Scanner;

public class HcfOfTwo_num {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        //HCF of two numbers
        int i, hcf=0;
        System.out.println("Enter first number:");
        int a=in.nextInt();
        System.out.println("Enter second number:");
        int b=in.nextInt();


        for(i=1; i<=a || i<=b;i++)
        {
            if(a%i==0 && b%i==0)
                hcf=i;
        }
        System.out.println("HCF of " + a + "and" +b+ "is"+hcf);
    }
}

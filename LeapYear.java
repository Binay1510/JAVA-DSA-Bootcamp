package assign;

import java.util.Scanner;

public class LeapYear {

    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.println("Enter any Year :");
        int year=in.nextInt();
        if(year%4==0){
            System.out.println(year + "is a leap year");

        }
        else {
            System.out.println(year + "is not a leap year");
        }

    }
}

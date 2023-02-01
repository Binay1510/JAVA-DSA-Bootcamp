package biny;

import java.util.Scanner;

public class switchhcase {

        public static void main(String[] args) {
            Scanner in=new Scanner(System.in);

//            String fruit=in.next();
//
//        switch (fruit) {
//            case "Mango" -> System.out.println("King of Fruits");
//            case "Apple" -> System.out.println("Red fruit");
//            case "Banana" -> System.out.println("Yellow fruit");
//            default -> System.out.println("Invalid, Please enter a valid fruit");

//            int day=in.nextInt();
//            switch (day) {
//                case 1, 2, 3, 4, 5 -> System.out.println("Weekday");
//                case 6, 7 -> System.out.println("weekend");
//            }

            //Nested Switch case

            String sandwich=in.next();
            String filling_type=in.next();

            switch (sandwich){
                case "chicken":
                    System.out.println("chicken sandwcih");
                    break;
                case "Beef":
                    System.out.println("Beef sandwcih");
                    break;
                case "Pork":
                    System.out.println("Pork sandwcih");
                    break;

                case "Vegetarian":
                    switch (filling_type){
                        case "tomato":
                            System.out.println("tomato filling");
                            break;
                        case "cheese":
                            System.out.println("cheese filling");
                            break;
                        case "potato":
                            System.out.println("potato filling");
                            break;
                        default:
                            System.out.println("filling not available");
                    }
                    break;
                default:
                    System.out.println("sandwich type not available");
            }


        }

    }
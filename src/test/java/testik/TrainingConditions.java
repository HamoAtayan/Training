package testik;

import java.util.Scanner;

/**
 * Created by Hmayak Atayan on  06, Jun, 2020
 */
public class TrainingConditions {


    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
//        System.out.print("please input a number : ");
        String name = scanner.next();
////        int j = scanner.nextInt();
//
//        if (n < 10){
//            System.out.println(n);
//        }
//        else if (n < 100){
//            System.out.println("<100");
//        }
//        else System.out.println("bigger than 100");
//    }

        switch (name) {
            case "test":
                System.out.println("n = " + name);
                break;
            case "test2":
                System.out.println("------");
                break;
            default:
                System.out.println("name");
        }

    }
}

package toask.java1;

import java.util.Scanner;

/**
 * Created by Hmayak Atayan on  06, Jun, 2020
 */
public class Switch2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int day = scanner.nextInt();
        switch (day) {
            case 4:
                System.out.println("the day is " + 4);
            case 5:
                System.out.println(5);
            default:
                System.out.println("default");
        }

    }
}

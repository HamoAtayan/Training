package testik;

import java.util.Scanner;

/**
 * Created by Hmayak Atayan on  06, Jun, 2020
 */
public class Loops {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
//        byte i = scanner.nextByte();
        for (int i = 0; i < 10; ++i) {
            for (int j = 0; j <10 ; j++) {
                if (j == 3){
                    break;
                }
                System.out.print("i = " + i);

                System.out.println(" j = " + j);
            }
        }


//        do {
//            System.out.println(i);
//            i--;
//        }
//        while (i >=0 );

    }
}

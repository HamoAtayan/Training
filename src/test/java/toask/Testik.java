package toask;

import org.junit.Assert;
import org.junit.Test;

/**
 * Created by Hmayak Atayan on  05, Jun, 2020
 */
public class Testik {

//    public static void main(String[] args) {
//        for (int i = 0; i < 5; i++) {
//            for (int j = 0; j < 5 ; j++) {
//                System.out.println("i = " + i);
//                System.out.println("j = " + j);
//            }
//        }
//    }

    @Test
    public void testing(){
        System.out.println("--------------------");
        System.out.println(System.getProperty("test"));
        Assert.assertEquals(System.getProperty("test"), "test");
    }
}

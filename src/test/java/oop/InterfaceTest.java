package oop;

/**
 * Created by Hmayak Atayan on  06, Jun, 2020
 */
public interface InterfaceTest {

    int number = 10;

    static int calculate(int a, int b) {
        return a + b;
    }

    default void print(){
        System.out.println("printing");
    }

    void check();

}

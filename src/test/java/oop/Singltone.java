package oop;

/**
 * Created by Hmayak Atayan on  06, Jun, 2020
 */
public class Singltone {
    //todo check this part
//    public final static Singltone singltone = new Singltone();
    public  static Singltone singltone ;

    private Singltone() {
        System.out.println("-----" );
    }


    public static Singltone getInstance(){
        if (singltone == null){
            singltone = new Singltone();
        }
        return singltone;
    }
}

package oop;

/**
 * Created by Hmayak Atayan on  06, Jun, 2020
 */
public final class Main implements InterfaceTest, InterfaceTest2 {
    public static void main(String[] args) {
//        Eat eating = new Eat() {
//            @Override
//            void eat() {
//                System.out.println("test");
//            }
//        };
//        System.out.println(InterfaceTest.number);

        Main main = new Main();
        main.print();
        main.print2();

//        InterfaceTest interfaceTest = () -> System.out.println("tets");

//        for (Months months:Months.values()) {
//            System.out.println(months.getMonthName());
//        }
//        System.out.println(Months.values()[3].getMonthName());
        Singltone test = Singltone.singltone;
        Singltone test2 = Singltone.singltone;
    }


    final static String NAME = "test";


    @Override
    public void check() {

    }
}


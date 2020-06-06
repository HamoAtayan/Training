package metods;

/**
 * Created by Hmayak Atayan on  06, Jun, 2020
 */
public class TrainingFunctions {
    public static void main(String[] args) {
//        System.out.println( calculate(10, 20));
//        System.out.println(c);

//        System.out.println(trainingFunctions.calculate(10, 20, 30));
//        System.out.println(recursion(5));
        check(10);
    }

    public static int recursion(int n) {
        if (n == 0) {
            return 1;
        }

        return n * recursion(n - 1);
    }

    public static void check(Object name) {
        System.out.println(name);
    }


}

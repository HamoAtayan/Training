package loops;

/**
 * Created by Hmayak Atayan on  30, May, 2020
 */
public class For {
    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            if (i == 5) {
                continue;
            }
            System.out.println(i);
        }
    }
}


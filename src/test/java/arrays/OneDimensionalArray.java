package arrays;

/**
 * Created by Hmayak Atayan on  06, Jun, 2020
 */
public class OneDimensionalArray {
    //    int number = 10;
    static Integer[] numbers = {10, 25, 36, 78};


    public static void main(String[] args) {
//        System.out.println(numbers);

        String[] texts = new String[5];
        for (int i = 0; i < texts.length; i++) {
            texts[i] = "some text" + i;
            System.out.println(texts[i]);
        }

//        for (int i = 0; i < numbers.length; i++) {
//            System.out.println(numbers[i]);
//        }
    }


}

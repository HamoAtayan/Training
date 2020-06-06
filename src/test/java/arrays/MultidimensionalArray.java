package arrays;

/**
 * Created by Hmayak Atayan on  06, Jun, 2020
 */
public class MultidimensionalArray {
    static int[][] multidimensional = {
            {1, 2, 3,}, //[0][0], [0][1] , [0][2]
            {2, 3, 4}, //[1][0], [1][1] , [1][2]
            {5, 6, 7},//[2][0], [2][1] [2][2]
            {7, 8, 9, 10}}; //[3][0], [3][1],[3][2] [3,3]


    public static void main(String[] args) {
        for (int i = 0; i < multidimensional.length; i++) {
            for (int j = 0; j < multidimensional[i].length; j++) {
                System.out.print(multidimensional[i][j]);
            }
            System.out.println();
        }
    }


   public static void printLine(){
        System.out.println("prining");
    }
}
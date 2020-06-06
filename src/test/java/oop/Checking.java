package oop;

import metods.Cat;

/**
 * Created by Hmayak Atayan on  06, Jun, 2020
 */
public class Checking {
    public static void main(String[] args) {
        Animals dog = new Animals(4, 10, 20, "a", 15);
        Animals dog2 = new Animals(4, 10, 20, "b", 25);
        Animals dog3 = new Animals(4, 10, 20, "c", 7);
        Animals dog4 = new Animals(4, 10, 20, "d", 9);

        System.out.println(dog3.getName() + " " + dog3.getNumberOfFoots() + " " + dog3.getHeight());

        Animals[] dogs = {dog, dog2, dog3, dog4};

        getOldestAnimal(dogs);


    }

    public static void getOldestAnimal(Animals[] animals) {
        int max = 0;
        for (int i = 1; i < animals.length; i++) {
            if (animals[i].getYear() > animals[max].getYear()) {
                max = i;
            }
        }
        System.out.println(animals[max]);
    }
}

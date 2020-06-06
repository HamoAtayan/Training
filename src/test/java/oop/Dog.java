package oop;

/**
 * Created by Hmayak Atayan on  06, Jun, 2020
 */
public class Dog extends Animals {

    public Dog(int numberOfFoots, int height, int weight, String name, int year) {
        super(numberOfFoots, height, weight, name, year);
        System.out.println("asas");
    }

    @Override
    public void walk() {
        System.out.println("running");
    }

    public Dog() {
    }

int number;


    Animals animals = new Dog(1, 2, 3, "asd", 5);
}

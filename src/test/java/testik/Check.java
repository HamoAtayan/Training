package testik;


import oop.Animals;

/**
 * Created by Hmayak Atayan on  06, Jun, 2020
 */
public class Check {

    public static void main(String[] args) {
        Animals animals = new Animals(6,35,20,"Duck",25);
        Animals animals2 = new Animals(4,14,56,"Dog",10);
        Animals animals1 = new Animals();
        System.out.println(animals2);
//        System.out.println(animals2.getHeight());
//        System.out.println(animals2.getNumberOfFoots());
//        System.out.println(animals2.getWeight());
//        System.out.println(animals2.getName());

        System.out.println(animals.compareTo(animals2));
        int n = animals.compareTo(animals2);
        if (n > 0){
            System.out.println(animals.getName() + " number of foots more than " + animals2.getName());
        }
        else if (n < 0){
            System.out.println(animals2.getName() + " number of foots more than " + animals.getName());
        }
        else System.out.println(animals.getName() + "equal to" + animals2.getName());

    }


}

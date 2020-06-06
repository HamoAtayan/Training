package oop;

/**
 * Created by Hmayak Atayan on  06, Jun, 2020
 */
public class Animals implements Comparable<Animals> {
    String text;
    protected int numberOfFoots;
    public int height;
    private String height2;
    private int weight;
    private String name;
    private int year;
    String credentails = "name:" + "%s" + " numberOfFoots: " + "%d" + " height " + "%d" + " weight " + "%d" + " year " + "%d";


    public Animals(int numberOfFoots, int height, int weight, String name, int year) {
        this.numberOfFoots = numberOfFoots;
        this.height = height;
        this.weight = weight;
        this.name = name;
        this.year = year;
    }

    public Animals() {
    }

    public Animals(int weight, int height, String name, int numberOfFoots) {
        this.numberOfFoots = numberOfFoots;
        this.height = height;
        this.weight = weight;
        this.name = name;
        System.out.println(height);

    }



    public int getNumberOfFoots() {
        return numberOfFoots;
    }

    public void setNumberOfFoots(int numberOfFoots) {
        this.numberOfFoots = numberOfFoots;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    public void fly() {
        System.out.println("fly");
    }


    @Override
    public int compareTo(Animals animals) {
        if (this.numberOfFoots > animals.numberOfFoots) {
            return 1;
        } else if (this.numberOfFoots < animals.numberOfFoots) {
            return -1;
        } else return 0;
    }

    @Override
    public String toString() {
        return String.format(credentails, name, numberOfFoots, height, weight, year);
    }

    public int getYear() {
        return year;
    }

    public void walk() {
        System.out.println("walking");
    }

    public final void sing(){
        System.out.println("singing");
    }
}

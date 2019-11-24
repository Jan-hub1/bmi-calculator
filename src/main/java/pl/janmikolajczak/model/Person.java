package pl.janmikolajczak.model;

public class Person {
    private int id;
    private String sex;
    private double height;
    private double weight;
    private double bmi;

    public Person(int id, String sex, double height, double weight, double bmi) {
        this.id = id;
        this.sex = sex;
        this.height = height;
        this.weight = weight;
        this.bmi = bmi;
    }
}

package pl.janmikolajczak.model;

public class Person {
    private int id;
    private double height;
    private double weight;
    private String sex;
    private double bmi;

    public Person(int id, double height, double weight, String sex, double bmi) {
        this.id = id;
        this.height = height;
        this.weight = weight;
        this.sex = sex;
        this.bmi = bmi;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public double getBmi() {
        return bmi;
    }

    public void setBmi(double bmi) {
        this.bmi = bmi;
    }
}

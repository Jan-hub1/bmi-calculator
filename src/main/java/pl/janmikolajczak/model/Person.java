package pl.janmikolajczak.model;

import java.math.BigDecimal;

public class Person {
    private int id;
    private Long height;
    private Long weight;
    private String sex;
    private BigDecimal bmi;

    public Person(int id, Long height, Long weight, String sex, BigDecimal bmi) {
        this.id = id;
        this.height = height;
        this.weight = weight;
        this.sex = sex;
        this.bmi = bmi;
    }

    public Person(int id, Long height, Long weight, String sex) {
        this.id = id;
        this.height = height;
        this.weight = weight;
        this.sex = sex;
    }

    public Person() {

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Long getHeight() {
        return height;
    }

    public void setHeight(Long height) {
        this.height = height;
    }

    public Long getWeight() {
        return weight;
    }

    public void setWeight(Long weight) {
        this.weight = weight;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public BigDecimal getBmi() {
        return bmi;
    }

    public void setBmi(BigDecimal bmi) {
        this.bmi = bmi;
    }
}

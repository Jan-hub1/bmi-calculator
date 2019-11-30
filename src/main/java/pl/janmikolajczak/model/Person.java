package pl.janmikolajczak.model;

import java.math.BigDecimal;

public class Person {
    private int id;
    private BigDecimal height;
    private BigDecimal weight;
    private String sex;
    private BigDecimal bmi;

    public Person(int id, BigDecimal height, BigDecimal weight, String sex, BigDecimal bmi) {
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

    public BigDecimal getHeight() {
        return height;
    }

    public void setHeight(BigDecimal height) {
        this.height = height;
    }

    public BigDecimal getWeight() {
        return weight;
    }

    public void setWeight(BigDecimal weight) {
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

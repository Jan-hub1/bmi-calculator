package pl.janmikolajczak.service;

import pl.janmikolajczak.model.Person;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class CalculateBmi {

    public static Person yourBmi(Person person) {
        BigDecimal x2 = new BigDecimal(2.0);
        BigDecimal heightx2 = new BigDecimal(person.getHeight()).multiply(x2);
        BigDecimal bmi = new BigDecimal(person.getWeight()).divide(heightx2, 4, RoundingMode.HALF_UP).movePointRight(2);
        Person newPerson = new Person(person.getId(), person.getHeight(), person.getWeight(),
                person.getSex(), bmi);

//        result = (weight / (height * 2)) * 100;
        return newPerson;
    }

}

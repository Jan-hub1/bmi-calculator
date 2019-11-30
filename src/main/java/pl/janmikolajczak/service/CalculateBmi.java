package pl.janmikolajczak.service;

import java.math.BigDecimal;

public class CalculateBmi {

    public static BigDecimal yourBmi(BigDecimal weight, BigDecimal height, String sex) {
        BigDecimal multiplayer = new BigDecimal(2);
        height = new BigDecimal(height.multiply(multiplayer));
        BigDecimal result = new BigDecimal(weight.divide())
//        result = (weight / (height * 2)) * 100;
        return result;
    }

}

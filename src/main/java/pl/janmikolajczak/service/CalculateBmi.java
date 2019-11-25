package pl.janmikolajczak.service;

public class CalculateBmi {

    public static double yourBmi(double weight, double height) {
        double result;
        result = (weight / (height * 2)) * 100;
        return result;
    }

}

package edu.training.simple.task4;

public class App {

    public static void main(String[] args) {
        double value = 1;
        double ret = getFunctionResult(value);
        System.out.println(ret);
    }

    public static double getFunctionResult(double x) {
        if (x <= 13) {
            return Math.pow(-1 * x, 3) + 9;
        } else {
            return -1 * 3 / (x + 1);
        }
    }
}

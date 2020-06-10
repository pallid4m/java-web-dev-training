package edu.training.simple.task3;

public class App {

    public static void main(String[] args) {
        double a = 5;
        double b = 3;
        double c = -2;

        if (a > b && b > c) {
            a *= 2;
            b *= 2;
            c *= 2;
        } else {
            a = Math.abs(a);
            b = Math.abs(b);
            c = Math.abs(c);
        }
    }
}

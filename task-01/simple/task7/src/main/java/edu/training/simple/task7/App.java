package edu.training.simple.task7;

public class App {

    public static void main(String[] args) {
        double number = 123.456;
        double reversedNumber = reverse(number);
        System.out.println(reversedNumber);
    }

    public static double reverse(double value) {
        double part = value % 1;
        double whole = value - part;
        return (int) (part * 1000) + whole / 1000;
    }
}

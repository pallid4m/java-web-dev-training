package edu.training.simple.task5;

import java.nio.charset.StandardCharsets;
import java.util.Scanner;

public class App {

    private int first;
    private int second;
    private int third;

    public static void main(String[] args) {

        App app = new App();
        Scanner scanner = new Scanner(System.in, StandardCharsets.UTF_8);
        do {
            System.out.print("> number: "); int number = scanner.nextInt();
            app.setDigits(number);
            int sum = app.getSum();
            int mul = app.getMul();
            int customDigit = app.getFourDigitNumber();
            System.out.printf("sum: %d\tmul: %d\tcustom: %d\n", sum, mul, customDigit);
        } while (true);
    }

    public void setDigits(int number) {
        first = number / 100;
        second = (number - first * 100) / 10;
        third = number - first * 100 - second * 10;
    }

    public int getSum() {
        return first + second + third;
    }

    public int getMul() {
        return first * second * third;
    }

    public int getFourDigitNumber() {
        return third * 1000 + first * 100 + second * 10 + third;
    }
}

package edu.training.simple.task4;

import java.nio.charset.StandardCharsets;
import java.util.Scanner;

public class App {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in, StandardCharsets.UTF_8);
        do {
            System.out.print("> x: ");
            double value = scanner.nextDouble();
            double ret = getFunctionResult(value);
            System.out.println(ret);
        } while (true);
    }

    public static double getFunctionResult(double x) {
        if (x <= 13) {
            return Math.pow(-1 * x, 3) + 9;
        } else {
            return -1 * 3 / (x + 1);
        }
    }
}

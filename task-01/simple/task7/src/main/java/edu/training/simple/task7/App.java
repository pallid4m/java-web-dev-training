package edu.training.simple.task7;

import java.nio.charset.StandardCharsets;
import java.util.Scanner;

public class App {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in, StandardCharsets.UTF_8);
        do {
            System.out.print("> value: ");
            double value = scanner.nextDouble();
            double ret = reverse(value);
            System.out.println(ret);
        } while (true);
    }

    public static double reverse(double value) {
        double part = value % 1 * 1000;
        double whole = (value - part) / 1000;
        return part + whole;
    }
}

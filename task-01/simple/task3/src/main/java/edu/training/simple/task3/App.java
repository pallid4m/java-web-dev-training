package edu.training.simple.task3;

import java.nio.charset.StandardCharsets;
import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.DoubleStream;

public class App {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in, StandardCharsets.UTF_8);
        do {
            double[] values = new double[3];
            System.out.print("> a: "); values[0] = scanner.nextDouble();
            System.out.print("> b: "); values[1] = scanner.nextDouble();
            System.out.print("> c: "); values[2] = scanner.nextDouble();
            values = doCorrect(values);
            System.out.println(Arrays.toString(values));
        } while (true);
    }

    public static double[] doCorrect(double[] array) {
        if (array[0] > array[1] && array[1] > array[2]) {
            return DoubleStream.of(array).map(App::redouble).toArray();
        } else {
            return DoubleStream.of(array).map(App::absolute).toArray();
        }
    }

    public static double redouble(double value) {
        return value * 2;
    }

    public static double absolute(double value) {
        return Math.abs(value);
    }
}

package edu.training.simple.task1;

import java.nio.charset.StandardCharsets;
import java.util.Optional;
import java.util.Scanner;

public class App {

    public static void main(String[] args) {
//        Optional<Double> opt = getSomeExpressionResult(-2, 2, 1);
//        Optional<Double> opt = getSomeExpressionResult(0, 2, 1);
//        Optional<Double> opt = getSomeExpressionResult(1, 2, 3);
        Scanner scanner = new Scanner(System.in, StandardCharsets.UTF_8);
        do {
            int a = 0, b = 0, c = 0;
            System.out.print("> a: "); a = scanner.nextInt();
            System.out.print("> b: "); b = scanner.nextInt();
            System.out.print("> c: "); c = scanner.nextInt();
            Optional<Double> opt = getSomeExpressionResult(a, b, c);
            opt.ifPresentOrElse(System.out::println, () -> System.out.println("try again pl"));
        } while (true);
    }

    public static Optional<Double> getSomeExpressionResult(double a, double b, double c) {
        double likeDiscriminant = Math.pow(b, 2) + 4 * a * c;
        if (likeDiscriminant < 0) {
            System.err.println("negative number in the sqrt");
            return Optional.empty();
        }
        if (a == 0) {
            System.err.println("division by zero");
            return Optional.empty();
        }
        return Optional.of((b + Math.sqrt(likeDiscriminant)) / (2 * a) - (Math.pow(a, 3) * c + Math.pow(b, -2)));
    }
}

package edu.training.simple.task8;

import java.nio.charset.StandardCharsets;
import java.util.Scanner;

public class App {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in, StandardCharsets.UTF_8);
        do {
            System.out.print("> a: "); int a = scanner.nextInt();
            System.out.print("> b: "); int b = scanner.nextInt();
            System.out.print("> h: "); int h = scanner.nextInt();
            System.out.print("> c: "); int c = scanner.nextInt();
            walk(a, b, h, c);
        } while (true);
    }

    public static void walk(int a, int b, int h, int c) {
        for (int x = a; x <= b; x += h) {
            int y = getFunction(x, c);
            System.out.println(y);
        }
    }

    private static int getFunction(int x, int c) {
        return x == 15 ? (x + c) * 2 : (x - c) + 6;
    }
}

package edu.training.simple.task6;

import java.math.BigInteger;
import java.nio.charset.StandardCharsets;
import java.util.Scanner;

public class App {

//    Sn = (a1 + an)* n / 2
//    an = a1 + (n - 1)* d
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in, StandardCharsets.UTF_8);
        do {
            System.out.print("> a1: "); int a1 = scanner.nextInt();
            System.out.print("> d: "); int d = scanner.nextInt();
            int overInt = getOverloadInt(a1, d);
            long overLong = getOverloadLong(a1, d);
            System.out.printf("overloaded int: %d\toverloaded long: %d\n", overInt, overLong);
        } while (true);
    }

    public static int getOverloadInt(int a1, int d) {
        int n = 2;
        while (true) {
            int an = a1 + (n - 1) * d;
            int sn = (a1 + an) * n / 2;
            try {
                BigInteger bigInteger = new BigInteger(String.valueOf(sn));
                bigInteger.intValueExact();
            } catch (Exception e) {
                e.printStackTrace();
                return n;
            }
            System.out.println(n);
            n++;
        }
    }

    public static long getOverloadLong(int a1, int d) {
        long n = 2;
        while (true) {
            long an = a1 + (n - 1) * d;
            long sn = (a1 + an) * n / 2;
            try {
                BigInteger bigInteger = new BigInteger(String.valueOf(sn));
                bigInteger.longValueExact();
            } catch (Exception e) {
                e.printStackTrace();
                return n;
            }
            n++;
        }
    }
}

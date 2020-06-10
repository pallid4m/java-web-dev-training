package edu.training.simple.task10;

import java.nio.charset.StandardCharsets;
import java.util.Scanner;

public class App {

    private static boolean seqIncrease = true;
    private static boolean samePairs = false;
    private static boolean signSwap = true;

    public static void main(String[] args) {
        int num;
        int prevNum = 0;

        Scanner scanner = new Scanner(System.in, StandardCharsets.UTF_8);
        do {
            System.out.print("> number: ");
            num = scanner.nextInt();
            if (prevNum != 0 && num != 0) {
                seqIncrease = num > prevNum && seqIncrease;
                samePairs = prevNum == num || samePairs;
                signSwap = Integer.signum(prevNum) != Integer.signum(num) && signSwap;
            }
            prevNum = num;
        } while (num != 0);
        System.out.printf("increasing sequence: %b\nsame pairs: %b\nsign swap: %b\n", seqIncrease, samePairs, signSwap);
    }
}

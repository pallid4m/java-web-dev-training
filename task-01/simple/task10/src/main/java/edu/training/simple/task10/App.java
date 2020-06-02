package edu.training.simple.task10;

import java.nio.charset.StandardCharsets;
import java.util.Scanner;

public class App {

    private boolean seqIncrease = true;
    private boolean samePairs = false;
    private boolean signSwap = true;

    public static void main(String[] args) {

        App app = new App();

        Scanner scanner = new Scanner(System.in, StandardCharsets.UTF_8);
        int num, prevNum = 0;
        do {
            System.out.print("> number: ");
            num = scanner.nextInt();
            if (prevNum != 0 && num != 0) {
                app.seqIncrease = num > prevNum && app.seqIncrease;
                app.samePairs = prevNum == num || app.samePairs;
                app.signSwap = Integer.signum(prevNum) != Integer.signum(num) && app.signSwap;
            }
            prevNum = num;
        } while (num != 0);
        System.out.printf("increasing sequence: %b\nsame pairs: %b\nsign swap: %b\n", app.seqIncrease, app.samePairs, app.signSwap);
    }
}

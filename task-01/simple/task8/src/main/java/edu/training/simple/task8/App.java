package edu.training.simple.task8;

public class App {

    public static void main(String[] args) {
        int a = -10;
        int b = 10;
        int h = 1;
        int c = 1;

        walk(a, b, h, c);
    }

    public static void walk(int a, int b, int h, int c) {
        for (int x = a; x <= b; x += h) {
            int y = getFunctionResult(x, c);
            System.out.println(y);
        }
    }

    private static int getFunctionResult(int x, int c) {
        return x == 15 ? (x + c) * 2 : (x - c) + 6;
    }
}

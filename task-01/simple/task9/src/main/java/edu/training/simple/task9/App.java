package edu.training.simple.task9;

public class App {

//    (1+2) * (1+2+3) * ... * (1+2+...+10)
    public static void main(String[] args) {
        long result = 1;
        for (int i = 2; i <= 10; i++) {
            long sum = 1;
            for (int j = 2; j <= i; j++) {
                sum += j;
            }
            result *= sum;
        }
        System.out.println(result);
    }
}

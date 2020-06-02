package edu.training.simple.task9;

public class App {

//    (1+2) * (1+2+3) * ... * (1+2+...+10)
    public static void main(String[] args) {
        long rr = 1;
        for (int i = 2; i <= 10; i++) {
            long tt = 1;
            for (int j = 2; j <= i; j++) {
                tt += j;
            }
            rr *= tt;
        }
        System.out.println(rr);
    }
}

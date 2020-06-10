package edu.training.simple.task1;

public class App {

    public static void main(String[] args) {
        double ret = getSomeExpressionResult(1, 2, 3);
        System.out.println(ret);
    }

    public static double getSomeExpressionResult(double a, double b, double c) {
        double likeDiscriminant = Math.pow(b, 2) + 4 * a * c;
        if (likeDiscriminant < 0) {
            System.err.print("negative number in the sqrt: ");
            return -1;
        }
        if (a == 0) {
            System.err.print("division by zero: ");
            return -1;
        }
        return (b + Math.sqrt(likeDiscriminant)) / (2 * a) - (Math.pow(a, 3) * c + Math.pow(b, -2));
    }
}

package edu.training.simple.task5;

public class App {

    private int firstDigit;
    private int secondDigit;
    private int thirdDigit;

    public static void main(String[] args) {
        int number = 123;

        App app = new App();
        app.setDigits(number);
        int sum = app.getSum();
        int mul = app.getMul();
        int customNumber = app.getCustomNumber();
        System.out.printf("sum: %d;\tmul: %d;\tcustom: %d;\n", sum, mul, customNumber);
    }

    public void setDigits(int number) {
        firstDigit = number / 100;
        secondDigit = (number - firstDigit * 100) / 10;
        thirdDigit = number - firstDigit * 100 - secondDigit * 10;
    }

    public int getSum() {
        return firstDigit + secondDigit + thirdDigit;
    }

    public int getMul() {
        return firstDigit * secondDigit * thirdDigit;
    }

    public int getCustomNumber() {
        return thirdDigit * 1000 + firstDigit * 100 + secondDigit * 10 + thirdDigit;
    }
}

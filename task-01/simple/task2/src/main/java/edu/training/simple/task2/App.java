package edu.training.simple.task2;

public class App {

    public static void main(String[] args) {
        int dayNumber = 123;
        dayMonthByNumber(dayNumber);
    }

    public static void dayMonthByNumber(int dayNumber) {
        int month;
        if (dayNumber <= 31) {
            month = 1;
            System.out.println(dayNumber + "/" + month);
            return;
        }
        dayNumber -= 31;
        if (dayNumber <= 28) {
            month = 2;
            System.out.println(dayNumber + "/" + month);
            return;
        }
        dayNumber -= 28;
        if (dayNumber <= 31) {
            month = 3;
            System.out.println(dayNumber + "/" + month);
            return;
        }
        dayNumber -= 31;
        if (dayNumber <= 30) {
            month = 4;
            System.out.println(dayNumber + "/" + month);
            return;
        }
        dayNumber -= 30;
        if (dayNumber <= 31) {
            month = 5;
            System.out.println(dayNumber + "/" + month);
            return;
        }
        dayNumber -= 31;
        if (dayNumber <= 30) {
            month = 6;
            System.out.println(dayNumber + "/" + month);
            return;
        }
        dayNumber -= 30;
        if (dayNumber <= 31) {
            month = 7;
            System.out.println(dayNumber + "/" + month);
            return;
        }
        dayNumber -= 31;
        if (dayNumber <= 31) {
            month = 8;
            System.out.println(dayNumber + "/" + month);
            return;
        }
        dayNumber -= 31;
        if (dayNumber <= 30) {
            month = 9;
            System.out.println(dayNumber + "/" + month);
            return;
        }
        dayNumber -= 30;
        if (dayNumber <= 31) {
            month = 10;
            System.out.println(dayNumber + "/" + month);
            return;
        }
        dayNumber -= 31;
        if (dayNumber <= 30) {
            month = 11;
            System.out.println(dayNumber + "/" + month);
            return;
        }
        dayNumber -= 30;
        if (dayNumber <= 31) {
            month = 12;
            System.out.println(dayNumber + "/" + month);
        }
    }
}

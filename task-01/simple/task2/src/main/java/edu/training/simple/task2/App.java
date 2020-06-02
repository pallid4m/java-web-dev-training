package edu.training.simple.task2;

import java.nio.charset.StandardCharsets;
import java.util.Scanner;

public class App {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in, StandardCharsets.UTF_8);
        String request;
        do {
            System.out.print("> ");
            request = scanner.next();
            System.out.println(dispatch(request));
        } while (!request.equals("q"));
    }

    public static String dispatch(String request) {
        try {
            int number = Integer.parseInt(request);
            if (isDayValid(number)) {
                return getDayMonthByNumber(number);
            } else {
                return "the day isn't valid";
            }
        } catch (Exception e) {
            return request.equals("q") ? "bye" : "smth have gone wrong";
        }
    }

    public static String getDayMonthByNumber(int dayNumber) {
        int[] daysInMoth = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        int i = 0;
        while (true) {
            if (dayNumber <= daysInMoth[i]) {
                return String.format("day: %d; month: %d", dayNumber, ++i);
            }
            dayNumber -= daysInMoth[i++];
        }
    }

    private static boolean isDayValid(int number) {
        return number <= 365 && number >= 0;
    }
}

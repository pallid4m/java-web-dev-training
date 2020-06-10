package edu.training.simple.task6;

public class App {

    public static void main(String[] args) {
        int a1 = 1;
        int d = 2;
        int overloadedInt = getOverloadedInt(a1, d);
        long overloadedLong = getOverloadedLong(a1, d);
        System.out.printf("overloaded int: %d\toverloaded long: %d\n", overloadedInt, overloadedLong);
    }

    public static int getOverloadedInt(int a1, int d) {
        int an, sn, prevSn = 0;
        int n = 3;
        while (true) {
            an = a1 + (n - 1) * d;
            sn = (a1 + an) * (n / 2);
            if (sn < prevSn && d > 0) {
                return n;
            }
            if (sn > prevSn && d < 0) {
                return n;
            }
            prevSn = sn;
            n++;
        }
    }

    public static long getOverloadedLong(long a1, long d) {
        long an, sn, prevSn = 0;
        long n = 3;
        while (true) {
            an = a1 + (n - 1) * d;
            sn = (a1 + an) * (n / 2);
            if (sn < prevSn && d > 0) {
                return n;
            }
            if (sn > prevSn && d < 0) {
                return n;
            }
            prevSn = sn;
            n++;
        }
    }
}

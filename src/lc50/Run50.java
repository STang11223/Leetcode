package lc50;

import java.util.ArrayList;
import java.util.List;

public class Run50 {
    public double myPow(double x, int n) {
        double sum = 1;
        long o = n;

        if (o < 0) x = 1 / x;
        o = Math.abs(o);

        while (o != 0) {
            if (o % 2 == 1) {
                sum *= x;
                o -= 1;
            }

            x *= x;
            o /= 2;
        }
//        return sum;
        return (double) Math.round(sum * 100000) / 100000;
    }

}

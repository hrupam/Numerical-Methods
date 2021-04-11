/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package numericalMethods;

/**
 *
 * @author rupam
 */
import java.text.DecimalFormat;
import java.util.*;

public class Bisection {

    static double f(double x) {
        return (Math.pow(x, 3) - 4 * x - 9);
//        return (x * Math.log10(x) - 1.2);
    }

    public static void main(String args[]) {
        int i = 0;
        double a, b;
        double x0 = 0, x1;
        Scanner sc = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("##.######");
        System.out.println("a= ");
        a = sc.nextDouble();
        System.out.println("b= ");
        b = sc.nextDouble();
        int spaces = 15;
        System.out.print("Iteration");
        for (int j = 1; j <= spaces - 9; j++) {
            System.out.print(" ");
        }
        System.out.println("x0");
        while (true) {
            x1 = (a + b) / 2;
            System.out.print(i);
            for (int j = 1; j <= spaces - (String.valueOf(i)).length(); j++) {
                System.out.print(" ");
            }
            System.out.println(df.format(x1));
            if (f(x1) > 0) {
                b = x1;
            } else if (f(x1) < 0) {
                a = x1;
            }

            if (i > 0) {
                /*Terminating Condition*/
                if (Math.abs(x0 - x1) <= 0.0001) //upto 4 decimal
                {
                    break;
                }

            }
            x0 = x1;
            i++;
        }

    }
}

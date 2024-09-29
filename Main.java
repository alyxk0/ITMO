package com.company;

import java.util.Random;

public class Main {
    public static void main(String[] args) {

        short[] z = new short[11];
        short value = 3;
        for (int i = 0; i < z.length; i++) {
            z[i] = value;
            value += 2;
        }

        /* еще один способ получения 6.0 включительно, но менее актуальный чем предложенный далее
        Random random = new Random();
        int min = -500000000;
        int max = 600000001;
        int randomNumber = random.nextInt(max - min) + min;
        double result = (double) randomNumber / 100000000;
        System.out.println(result);
        */

        double[] x = new double[20];
        Random random = new Random();
        for (int i = 0; i < x.length; i++) {
            x[i] = -5.0 + (Math.nextUp(6.0) - (-5.0)) * random.nextDouble(); //при помощи Math.nextUp получаем до 6.0 включительно
        }

        double[][] z1 = new double[11][20];

        for (int i = 0; i < z.length; i++) {
            for (int j = 0; j < z1[i].length; j++) {
                z1[i][j] = calculateElement(z[i], x[j]);
            }
        }

        printMatrix(z1);
    }

    public static double calculateElement(short zValue, double xValue) {
        if (zValue == 9) {
            return Math.sin(Math.cbrt(Math.cos(xValue)));
        } else if (zValue == 3 || zValue == 7 || zValue == 11 || zValue == 15 || zValue == 23) {
            return Math.atan(Math.pow(Math.pow((xValue + 0.5) / 11, 2), 2));
        } else {
            return Math.cbrt(Math.tan(Math.cos(Math.exp(xValue))));
        }
    }

    public static void printMatrix(double[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.printf("%5.2f ", matrix[i][j]);
            }
            System.out.println();
        }
    }
}

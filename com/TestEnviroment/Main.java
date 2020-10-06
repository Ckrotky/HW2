package com.TestEnviroment;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[][] arr = new int[(int)(Math.random()*10)][(int)(Math.random()*10)];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = new int[(int) (Math.random() * 10)];
            for (int j = 0; j < arr[i].length; j++) {
                arr[i][j] = (int) (Math.random() * 100);
            }
        }

        for (int[] ints : arr) {
            for (int anInt : ints) {
                System.out.print(anInt + " ");
            }
            System.out.println();
        }
    }
}
package com.abiyasidalmajid2300011.tugaspertemuan7;

import java.util.Random;

public class TP7 {
    public static void selectionSort(int[] num) {
        int n = num.length;
        
        for (int i = 0; i < n - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < n; j++) {
                if (num[j] < num[minIndex]) {
                    minIndex = j;
                }
            }
            int temp = num[minIndex];
            num[minIndex] = num[i];
            num[i] = temp;
        }
    }

    public static void main(String[] args) {
        int totalRandomNum = 100000;
        int[] num = new int[totalRandomNum];
        Random randomNum = new Random();
        
        for (int i = 0; i < totalRandomNum; i++) {
            num[i] = randomNum.nextInt(100000);
        }
        
        StopWatch stopwatch = new StopWatch();
        
        stopwatch.start();

        selectionSort(num);
        
        stopwatch.stop();
        
        System.out.println("Waktu eksekusi selection sort untuk mengurutkan 100000 angka random: ");
        System.out.println(stopwatch.getElapsedTime() + " ms");
    }    
}
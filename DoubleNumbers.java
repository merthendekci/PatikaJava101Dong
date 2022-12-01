package Loops;

import java.util.Scanner;

public class DoubleNumbers {
    public static void main(String[] args) {
        int k, i, total = 0, count = 0, average;
        Scanner input = new Scanner(System.in);
        System.out.print("Bir sayı giriniz:");
        k = input.nextInt();
        for (i = 0; i <= k; i++) {
            if ((i % 3 == 0) && (i % 4 == 0)) {
                count += 1;
                total += i;
            }
        }
        average = total / count;
        System.out.println("toplam :" + total);
        System.out.println("ortalama:" + average);
    }
}
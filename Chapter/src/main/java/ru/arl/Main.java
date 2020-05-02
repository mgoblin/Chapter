package ru.arl;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String str = scan.next();

        char[] result = str.toCharArray();

        int sum = 0;

        for (int i = 0; i < result.length; i++)
            if (Character.isDigit(result[i])) {
                sum = sum+result[i];
            }
        System.out.println(sum);
    }
}
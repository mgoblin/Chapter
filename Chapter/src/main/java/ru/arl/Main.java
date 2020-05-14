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

//    package lesson1;
//
//    public class Task1_8 {
//        public static void main(String[] args) {
//            Task1_8 year = new Task1_8();
//            year.leapYear(2000);
//            year.leapYear(1000);
//            year.leapYear(2016);
//            year.leapYear(2021);
//
//            System.out.println(' ');
//
//            year.leapYear1(2000);
//            year.leapYear1(1000);
//            year.leapYear1(2016);
//            year.leapYear1(2021);
//
//            System.out.println(' ');
//
//            year.leapYear2(2000);
//            year.leapYear2(1000);
//            year.leapYear2(2016);
//            year.leapYear2(2021);
//
//            System.out.println(' ');
//
//            year.leapYear3(2000);
//            year.leapYear3(1000);
//            year.leapYear3(2016);
//            year.leapYear3(2021);
//        }
//
//        public void leapYear3(int year) {
//            System.out.print(year);
//            if (year % 4 != 0 || (year % 100 == 0 && year % 400 != 0)) {
//                System.out.print(" не");
//            }
//            System.out.println(" високосный год");
//        }
//
//        public void leapYear2(int year) {
//            String not = year % 4 != 0 || (year % 100 == 0 && year % 400 != 0) ? "не " : "";
//            System.out.println(year + " " + not + "високосный год");
//        }
//
//        public void leapYear1(int year) {
//            if (year % 4 != 0 || (year % 100 == 0 && year % 400 != 0)) {
//                System.out.println(year + " не високосный год");
//            } else {
//                System.out.println(year + " високосный год");
//            }
//        }
//
//        public void leapYear(int year) {
//            if (year % 4 == 0) {
//                if (year % 100 == 0) {
//                    if (year % 400 == 0) {
//                        System.out.println(year + " високосный год");
//                    } else {
//                        System.out.println(year + " не високосный год");
//                    }
//                } else {
//                    System.out.println(year + " високосный год");
//                }
//            } else {
//                System.out.println(year + " не високосный год");
//            }
//        }
//    }

}
package com.example.task05;

public class Task05 {

    public static boolean isEven(int x) {
        return x % 2 == 0;
    }

    public static String solution(int x) {

        // Done

        while (x != 0) {
            if (!isEven(x)) return "FALSE";
            x /= 10;
        }

        return "TRUE";
    }

    public static void main(String[] args) {

    }

}

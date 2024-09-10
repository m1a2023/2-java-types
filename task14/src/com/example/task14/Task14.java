package com.example.task14;

public class Task14 {


    public static int reverse(int value) {

        // Done

        while (value % 10 == 0) {
            value /= 10;
        }

        return Integer.parseInt(
                new StringBuilder(Integer.toString(value)).reverse().toString()
        );
    }

    public static void main(String[] args) {

    }


}

package com.example.task06;

public class Task06 {

    public static int solution(int x, int y) {

        // Done

        int sum = Math.abs(x + y);
        int result = 0;

        if (sum == 0) return 1;

        while (sum > 0) {
            result++;
            sum /= 10;
        }

        return result;
    }

    public static void main(String[] args) {

    }

}

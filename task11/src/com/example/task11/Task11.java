package com.example.task11;

public class Task11 {

    public static float benefit(float sum, float percent) {

        // TODO исправьте функцию, чтобы избежать накопления ошибки


        // Считаем проценты за год
        for (int i = 0; i <= 11; i++) {

        }

        return sum ;
    }

    public static void main(String[] args) {

        float sum = 500f; // 500 руб. на счете
        float percent = 0.00000001f; // 0.000001% ежемесячно

        sum = benefit(sum, percent);

        System.out.println("Сумма на счете через год: " + sum * (1 + percent));

    }

}

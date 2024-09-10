package com.example.task04;

public class Task04 {

    public static float calculate(int a, int b, String operation) {

        // Done

        switch (operation) {
            case "+":
                return (float)(a + b);
            case "-":
                return (float)(a - b);
            case "*":
                return (float)(a * b);
            case "/":
                if (b == 0) throw new AttemptToDivideByZeroException();
                return a / (float)b;
        }

        return 0;
    }

    public static void main(String[] args) {
        // Здесь вы можете вручную протестировать ваше решение, вызывая реализуемый метод и смотря результат
        // например вот так:
        /*
        float result = calculate(-25, 5, "/");
        System.out.println(result);
        */
    }

}

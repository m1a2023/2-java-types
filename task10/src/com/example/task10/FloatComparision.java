package com.example.task10;

public class FloatComparision {

    public static boolean areNan(float a, float b) {
        return Float.isNaN(a) && Float.isNaN(b);
    }

    private static boolean areInfinite(float a, float b) {
        return Float.isInfinite(a) && Float.isInfinite(b);
    }
    public static boolean areInfiniteEqual(float a, float b) {
        if (areInfinite(a, b))
            return a == b;
        return false;
    }

    public static boolean areEqual(float a, float b, int precision) {
        return Math.abs(a - b) < Math.pow(10, -precision);
    }

    public static boolean compare(float a, float b, int precision) {
        return (areNan(a, b) || areInfiniteEqual(a, b) || areEqual(a, b, precision));
    }
}

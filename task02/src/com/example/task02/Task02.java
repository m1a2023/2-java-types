package com.example.task02;

public class Task02 {

    public static String solution(String input) {

        // Done
        BaseDataTypesParser parser = new BaseDataTypesParser(input);

        return parser.getSuitableDataType();
    }

    public static void main(String[] args) {

    }

}

package com.example.task02;

public class BaseDataTypesParser {

    private final String value;
    private String typeValue;

    BaseDataTypesParser(String value) {
        this.value = value;
    }

    public String getTypeValue() {
        return this.typeValue;
    }

    public void setTypeValue(String typeValue) {
        this.typeValue = typeValue;
    }

    private boolean tryParseByte() {
        try {
            Byte.parseByte(value);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }

    private boolean tryParseShort(){
        try {
            Short.parseShort(value);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }

    private boolean tryParseInteger() {
        try {
            Integer.parseInt(value);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }

    private boolean tryParseLong() {
        try {
            Long.parseLong(value);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }

    public String getSuitableDataType() {

        if (tryParseByte()) {
            setTypeValue("byte");
        }
        else if (tryParseShort()) {
            setTypeValue("short");
        }
        else if (tryParseInteger()) {
            setTypeValue("int");
        }
        else {
            setTypeValue("long");
        }

        return getTypeValue();
    }
}



package org.example._2024_02_20;

public class ClassWork {
    public static void main(String[] args) {
        byte byteValue = 10; // (-128 +127) 2^8
        short shortValue = 500; // (-32000 +32000) 2^16
        int intValue = 1000000; // (-2 000 000 000    +2 000 000 000) 2^32
        long longValue = 10000000000000l; // (-9 * 10^18  +9 * 10^18) 2^64

        float floatValue = 36.6f; //
        double doubleValue = 36.6666666;

        char charValue = (char) 65000; // 2 байта
        boolean booleanValue = true; // 1 байт

        System.out.println(charValue);

    }
}

package org.example._2024_02_20;

public class ClassWork {
    public static void main(String[] args) {
        byte byteValue = 10; // (-128 +127) 2^8
        short shortValue = 500; // (-32000 +32000) 2^16
        int intValue = 1000000; // (-2 000 000 000    +2 000 000 000) 2^32
        long longValue = 10000000000000l; // (-9 * 10^18  +9 * 10^18) 2^64

        float floatValue = 36.6f; //
        double doubleValue = 36.6666666;

        char charValue = '5'; // 2 байта
        boolean booleanValue = false; // 1 байт

        int countDown = 10;

        while (countDown >= 0) { // пока выполняется условие в скобках - выполняется тело цикла
            System.out.println(countDown);
            countDown = countDown - 1; // уменьшаем countDown на 1;   эквивалентно countDown--;
        }

        System.out.println("--------------");

        int count = 0;
        while (true) {
            if (count == 3) {
                break;
            }
            System.out.println(count);
            count++;
        }
    }
}

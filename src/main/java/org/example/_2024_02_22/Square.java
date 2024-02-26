package org.example._2024_02_22;

import java.util.Scanner;

//посчитать площадь квадрата
public class Square {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);  // создаём объект сканнера, для принятия параметров из консоли
        System.out.println("Enter side size: ");
        double side = sc.nextDouble();        // принимаем из консоли аргумент типа double
        double area = calculateArea(side);
        System.out.println(area);
    }

    public static double calculateArea(double side) {
        double area = side * side;
        return area;
    }
}

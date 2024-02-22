package org.example._2024_02_22;

import org.example._2024_02_19.HelloWorld;
import org.example._2024_02_20.ClassWork;

import java.util.Scanner;

//посчитать площадь квадрата
public class Square {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);  // создаём объект сканнера, для принятия параметров из консоли
        ClassWork.main(null);            // вызов метода другого класса
        System.out.println("Enter side size: ");
        double side = sc.nextDouble();        // принимаем из консоли аргумент типа double
/*        String string = sc.nextLine();        // принимаем из консоли аргумент типа String
        char ch = sc.nextLine().charAt(0); */       // принимаем из консоли аргумент типа char

        System.out.println("строка1 \n строка2 \n стро");

        double area = calculateArea(side);
        System.out.println(area);
    }

    public static double calculateArea(double side) {
        double area = side * side;
        return area;
    }
}

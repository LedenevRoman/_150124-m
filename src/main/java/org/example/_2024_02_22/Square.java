package org.example._2024_02_22;

import org.example._2024_02_19.HelloWorld;

import java.util.Scanner;

//посчитать площадь квадрата
public class Square {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);  // создаём объект сканнера, для принятия параметров из консоли

        System.out.println("Enter side size: ");
        double side = sc.nextDouble();        // принимаем из консоли аргумент типа double
/*        String string = scanner.nextLine(); */       // принимаем из консоли аргумент типа String
/*        char ch = scanner.next().charAt(0);  */      // принимаем из консоли аргумент типа char

        double area = side * side;
        System.out.println(area);
    }
}

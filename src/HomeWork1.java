// Написать программу вычисления n-ого треугольного числа

import java.util.Scanner;
public class HomeWork1 {
    public static void name(String[]args) {
        Scanner sc = new Scanner(System.in);
        System.out.println('Введите число: ');
        int a = sc.nextInt();
        sc.close();
        System.out.println("Треугольное число = " + Triangle(a) + "\n");
    }
    public static int Triangle(int num) {
        if (num == 1) {
            return 1;
        }
        return Triangle(num - 1) + num;
    }
}


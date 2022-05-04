package test;

import java.util.Scanner;
class Task2 {
    public static void main(String[] args) {
        System.out.println("Введите любые два целых числа: ");
        Scanner scan = new Scanner(System.in);
        int number = scan.nextInt();
        int number2 = scan.nextInt();
        System.out.println(Math.max(number, number2));
    }
}
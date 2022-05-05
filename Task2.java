package test;
/*Создать консольное приложение которое
будет при  нимать 2 любых числа и показывать какое больше
 */
import java.util.Scanner;
class Task2 {
    public static void main(String[] args) {
        System.out.println("Введите любое число: ");
        Scanner scan = new Scanner(System.in);
        int number = scan.nextInt();
        System.out.println("Введите любое число: ");
        int number2 = scan.nextInt();
        System.out.print("Max число:");
        System.out.println(Math.max(number, number2));
    }
}
package test;
/*Создать консольное приложение в котором можно задать минимальное
и максимальное число, после чего в консоль выводятся
все простые числа в указанном промежутке
 */
import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        System.out.println("Введите любое число: ");
        Scanner scan = new Scanner(System.in);
        int number = scan.nextInt();
        System.out.println("Введите любое число: ");
        int number2 = scan.nextInt();
        System.out.println(Math.max(number, number2));
    }
}
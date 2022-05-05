package test;
/*Создать консольное приложение в котором можно задать минимальное
и максимальное число, после чего в консоль выводятся
все простые  числа в указанном промежутке
 */
import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        System.out.println("Введите число min ");
        Scanner scan = new Scanner(System.in);
        int namber = scan.nextInt();
        System.out.println("Введите число mах");
        int namber2 = scan.nextInt();
        for (int i = namber; i <= namber2; i++) {
            if (isPrime(i)) {
                System.out.println(i + " ");
            }
        }
    }
    public static boolean isPrime(int num) {
        if (num < 2) return false;
        int temp;
        for (int i = 2; i <= num / 2; i++) {
            temp = num % i;
            if (temp == 0) {
                return false;
            }
        }
        return true;
    }
}

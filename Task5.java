package test;
/*Создать консольное приложение, которое при старте попросит указать пароль и далее будет спрашивать его, пока не будет введен верный, после ввода верного пароля
программа закончит свое выполнение,   при вводе некорректного пароля, будет просьба ввести новый
 */
import java.util.Scanner;
public class Task5 {
    public static void main(String[] args) {

        Scanner user_input = new Scanner(System.in);
        System.out.println("Введите пароль: ");
        String first_name = user_input.next();
    }
}

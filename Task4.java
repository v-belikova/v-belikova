package test;
/*4. Создать консольное приложение
корзина, в корзину  можно добавлять продукты а затем выводить их все в консоль
 */
import java.util.Scanner;
import java.util.*;
public class Task4 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String[] cart = new String[5];
        for (int i = 0; i < cart.length; i++) {
            System.out.println("Добавьте продукты: " + (i + 1));
            cart[i] = scan.nextLine();
        }
        System.out.println("В корзине: ");
        System.out.println(Arrays.toString(cart));
    }
}







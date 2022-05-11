package test;
/*Создать консольное приложение, которое при старте попросит указать пароль и далее будет спрашивать его, пока не будет введен верный, после ввода верного пароля
программа закончит свое выполнение,   при вводе некорректного пароля, будет просьба ввести новый
 */
import java.util.Scanner;
public class Task5 {
    public static void main(String[] args) {
<<<<<<< HEAD
        String password;
        Scanner scan = new Scanner(System.in);

        System.out.println("Введите пароль: ");
        password = scan.next();

        if(password.equals("123456789")) {
            System.out.println("Пароль введен верно");
        }else{
            System.out.println("Пароль введен не верно, попробуй еще раз");
        }

        scan.close();
        }



    }
=======
        String pass = "123qaz";
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите пароль: ");
        String password = scan.nextLine();
        while (!password.equals(pass)) {
            System.out.println("Пароль введен не верно! Попробуй еще раз!");
            password = scan.nextLine();
        }
    }
}


>>>>>>> b8513b4348e72fc540b5f7173d9b7f219ef5943b


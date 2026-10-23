// Часть 1, задание 7: факториал
import java.util.Scanner;

public class Task07 {
    public static long factorial(int n) {
        if (n < 0 || n > 20) {
            throw new IllegalArgumentException("Допустимы числа от 0 до 20");
        }
        long result = 1;
        for (int i = 2; i <= n; i++) {
            result *= i;
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите число от 0 до 20: ");
        int n = scanner.nextInt();
        if (n < 0 || n > 20) {
            System.out.println("Допустимы числа от 0 до 20.");
            return;
        }
        System.out.println(n + "! = " + factorial(n));
    }
}

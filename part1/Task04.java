// Часть 1, задание 4: ввод, сумма, минимум и максимум
import java.util.Scanner;

public class Task04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Количество чисел: ");
        int n = scanner.nextInt();
        if (n <= 0) {
            System.out.println("Количество должно быть положительным.");
            return;
        }
        int[] numbers = new int[n];
        int i = 0;
        do {
            System.out.print("Введите число: ");
            numbers[i] = scanner.nextInt();
            i++;
        } while (i < n);

        long sumWhile = 0;
        int min = numbers[0];
        int max = numbers[0];
        i = 0;
        while (i < n) {
            sumWhile += numbers[i];
            if (numbers[i] < min) min = numbers[i];
            if (numbers[i] > max) max = numbers[i];
            i++;
        }
        long sumDoWhile = 0;
        i = 0;
        do {
            sumDoWhile += numbers[i];
            i++;
        } while (i < n);
        System.out.println("Сумма (while): " + sumWhile);
        System.out.println("Сумма (do while): " + sumDoWhile);
        System.out.println("Минимум: " + min);
        System.out.println("Максимум: " + max);
    }
}

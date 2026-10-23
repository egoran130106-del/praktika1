// Часть 1, задание 3: сумма и среднее массива
// Часть 1, задание 3. Массив задается в программе.
public class Task03 {
    public static void main(String[] args) {
        int[] numbers = {3, 7, 2, 8, 5};
        int sum = 0;
        for (int i = 0; i < numbers.length; i++) {
            sum += numbers[i];
        }
        double average = (double) sum / numbers.length;
        System.out.println("Сумма: " + sum);
        System.out.println("Среднее: " + average);
    }
}

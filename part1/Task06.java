// Часть 1, задание 6: первые 10 членов гармонического ряда
import java.util.Locale;

public class Task06 {
    public static void main(String[] args) {
        for (int i = 1; i <= 10; i++) {
            System.out.printf(Locale.US, "1/%d = %.4f%n", i, 1.0 / i);
        }
    }
}

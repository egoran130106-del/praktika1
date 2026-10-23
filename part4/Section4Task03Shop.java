// Часть 4, раздел 4, задание 3: учебный интернет-магазин
import java.util.ArrayList;
import java.util.Scanner;

public class Section4Task03Shop {
    // Только учебная учетная запись, без настоящих платежей и регистрации.
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Логин: ");
        String login = scanner.nextLine();
        System.out.print("Пароль: ");
        String password = scanner.nextLine();
        if (!login.equals("student") || !password.equals("1234")) {
            System.out.println("Неверный логин или пароль.");
            return;
        }
        Product[] products = {
            new Product("Учебник Java", 800, Category.BOOKS),
            new Product("Словарь", 500, Category.BOOKS),
            new Product("Тетрадь", 50, Category.STATIONERY),
            new Product("Ручка", 30, Category.STATIONERY)
        };
        ArrayList<Product> basket = new ArrayList<Product>();
        Category selected = null;
        while (true) {
            System.out.println("1 - Каталоги; 2 - Товары каталога; 3 - Добавить товар;");
            System.out.println("4 - Корзина; 5 - Купить; 0 - Выход");
            int choice = readNumber(scanner);
            switch (choice) {
                case 1:
                    Category[] categories = Category.values();
                    for (int i = 0; i < categories.length; i++) {
                        System.out.println((i + 1) + ". " + categories[i]);
                    }
                    break;
                case 2:
                    System.out.print("Номер каталога (1 - книги, 2 - канцелярия): ");
                    int categoryNumber = readNumber(scanner);
                    if (categoryNumber < 1 || categoryNumber > Category.values().length) {
                        System.out.println("Нет такого каталога.");
                        break;
                    }
                    selected = Category.values()[categoryNumber - 1];
                    for (int i = 0; i < products.length; i++) {
                        if (products[i].getCategory() == selected) {
                            System.out.println((i + 1) + ". " + products[i]);
                        }
                    }
                    break;
                case 3:
                    if (selected == null) {
                        System.out.println("Сначала выберите каталог, пункт 2.");
                        break;
                    }
                    System.out.print("Номер товара из каталога: ");
                    int number = readNumber(scanner);
                    if (number < 1 || number > products.length
                            || products[number - 1].getCategory() != selected) {
                        System.out.println("В выбранном каталоге нет такого товара.");
                    } else {
                        basket.add(products[number - 1]);
                        System.out.println("Товар добавлен.");
                    }
                    break;
                case 4:
                case 5:
                    if (basket.isEmpty()) {
                        System.out.println("Корзина пуста.");
                        break;
                    }
                    int total = 0;
                    for (Product product : basket) {
                        System.out.println(product);
                        total += product.getPrice();
                    }
                    System.out.println("Итого: " + total + " руб.");
                    if (choice == 5) {
                        System.out.println("Учебная покупка выполнена.");
                        basket.clear();
                    }
                    break;
                case 0: return;
                default: System.out.println("Нет такого пункта.");
            }
        }
    }

    private static int readNumber(Scanner scanner) {
        String text = scanner.nextLine();
        try {
            return Integer.parseInt(text);
        } catch (NumberFormatException e) {
            return -1;
        }
    }

    // Классы этого задания собраны в одном файле для удобного запуска.
    public enum Category {
        BOOKS("Книги"), STATIONERY("Канцелярия");
        private String title;
        Category(String title) { this.title = title; }
        public String toString() { return title; }
    }

    public static class Product {
        private String name;
        private int price;
        private Category category;
        public Product(String name, int price, Category category) {
            this.name = name;
            this.price = price;
            this.category = category;
        }
        public Category getCategory() { return category; }
        public int getPrice() { return price; }
        public String toString() { return name + " - " + price + " руб."; }
    }
}

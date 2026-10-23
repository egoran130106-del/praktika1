// Часть 4, раздел 4.1, задание 9: магазин мебели
public class Section41Task09Furniture {
    public static void main(String[] args) {
        Furniture[] items = {new Chair("дерево", 2000), new Table("дерево", 7000),
                new Wardrobe("ДСП", 12000)};
        FurnitureShop shop = new FurnitureShop(items);
        shop.showFurniture();
        shop.buy(2);
        shop.buy(9);
    }

    // Классы этого задания собраны в одном файле для удобного запуска.
    public static class Chair extends Furniture {
        public Chair(String material, double price) { super(material, price); }
        public String getType() { return "Стул"; }
    }

    public static abstract class Furniture {
        protected String material;
        protected double price;
        public Furniture(String material, double price) { this.material = material; this.price = price; }
        public double getPrice() { return price; }
        public abstract String getType();
        public String toString() { return getType() + ", материал: " + material + ", цена: " + price; }
    }

    public static class FurnitureShop {
        private Furniture[] items;
        public FurnitureShop(Furniture[] items) { this.items = items; }
        public void showFurniture() {
            for (int i = 0; i < items.length; i++) {
                System.out.println((i + 1) + ". " + items[i]);
            }
        }
        public void buy(int number) {
            if (number < 1 || number > items.length) {
                System.out.println("Нет такого товара.");
                return;
            }
            System.out.println("Выбрано: " + items[number - 1]);
            System.out.println("К оплате: " + items[number - 1].getPrice());
        }
    }

    public static class Table extends Furniture {
        public Table(String material, double price) { super(material, price); }
        public String getType() { return "Стол"; }
    }

    public static class Wardrobe extends Furniture {
        public Wardrobe(String material, double price) { super(material, price); }
        public String getType() { return "Шкаф"; }
    }
}

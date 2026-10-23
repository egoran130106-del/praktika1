// Часть 4, раздел 4, задание 2: ателье
public class Section4Task02Atelier {
    public static void main(String[] args) {
        Clothes[] clothes = {
            new TShirt(Size.XXS, 500, "белый"),
            new Pants(Size.M, 1500, "черный"),
            new Skirt(Size.S, 1200, "синий"),
            new Tie(Size.L, 600, "красный")
        };
        Atelier atelier = new Atelier();
        System.out.println("Мужская одежда:");
        atelier.dressMan(clothes);
        System.out.println("Женская одежда:");
        atelier.dressWomen(clothes);
    }

    // Классы этого задания собраны в одном файле для удобного запуска.
    public static class Atelier {
        public void dressMan(Clothes[] clothes) {
            for (Clothes item : clothes) {
                if (item instanceof MenClothing) ((MenClothing) item).dressMan();
            }
        }
        public void dressWomen(Clothes[] clothes) {
            for (Clothes item : clothes) {
                if (item instanceof WomenClothing) ((WomenClothing) item).dressWomen();
            }
        }
    }

    public static abstract class Clothes {
        protected Size size;
        protected double price;
        protected String color;
        public Clothes(Size size, double price, String color) {
            this.size = size;
            this.price = price;
            this.color = color;
        }
        public String toString() {
            return "размер " + size + " (" + size.getEuroSize() + ", " + size.getDescription()
                    + "), цена " + price + ", цвет " + color;
        }
    }

    public interface MenClothing { void dressMan(); }

    public static class Pants extends Clothes implements MenClothing, WomenClothing {
        public Pants(Size size, double price, String color) { super(size, price, color); }
        public void dressMan() { System.out.println("Штаны: " + this); }
        public void dressWomen() { System.out.println("Штаны: " + this); }
    }

    public enum Size {
        XXS(32) {
            @Override
            public String getDescription() { return "Детский размер"; }
        }, XS(34), S(36), M(38), L(40);
        private int euroSize;
        Size(int euroSize) { this.euroSize = euroSize; }
        public int getEuroSize() { return euroSize; }
        public String getDescription() { return "Взрослый размер"; }
    }

    public static class Skirt extends Clothes implements WomenClothing {
        public Skirt(Size size, double price, String color) { super(size, price, color); }
        public void dressWomen() { System.out.println("Юбка: " + this); }
    }

    public static class Tie extends Clothes implements MenClothing {
        public Tie(Size size, double price, String color) { super(size, price, color); }
        public void dressMan() { System.out.println("Галстук: " + this); }
    }

    public static class TShirt extends Clothes implements MenClothing, WomenClothing {
        public TShirt(Size size, double price, String color) { super(size, price, color); }
        public void dressMan() { System.out.println("Футболка: " + this); }
        public void dressWomen() { System.out.println("Футболка: " + this); }
    }

    public interface WomenClothing { void dressWomen(); }
}

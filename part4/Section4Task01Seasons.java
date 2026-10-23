// Часть 4, раздел 4, задание 1: времена года
public class Section4Task01Seasons {
    public static void printLove(Season season) {
        switch (season) {
            case WINTER: System.out.println("Я люблю зиму"); break;
            case SPRING: System.out.println("Я люблю весну"); break;
            case SUMMER: System.out.println("Я люблю лето"); break;
            case AUTUMN: System.out.println("Я люблю осень"); break;
        }
    }
    public static void main(String[] args) {
        Season favorite = Season.SUMMER;
        System.out.println("Любимое время: " + favorite + ", " + favorite.getTemperature()
                + " C, " + favorite.getDescription());
        printLove(favorite);
        for (Season season : Season.values()) {
            System.out.println(season + ": " + season.getTemperature() + " C, " + season.getDescription());
        }
    }

    // Классы этого задания собраны в одном файле для удобного запуска.
    public enum Season {
        WINTER("Зима", -10), SPRING("Весна", 10),
        SUMMER("Лето", 25) {
            @Override
            public String getDescription() { return "Теплое время года"; }
        },
        AUTUMN("Осень", 8);

        private String name;
        private double temperature;
        Season(String name, double temperature) {
            this.name = name;
            this.temperature = temperature;
        }
        public double getTemperature() { return temperature; }
        public String getDescription() { return "Холодное время года"; }
        public String toString() { return name; }
    }
}

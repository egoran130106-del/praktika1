// Часть 4, раздел 4.1, задание 10: транспорт
import java.util.Locale;

public class Section41Task10Transport {
    public static void main(String[] args) {
        Transport[] transports = {new Car(), new Airplane(), new Train(), new Ship()};
        double distance = 400;
        int passengers = 2;
        double tons = 0.2;
        for (Transport transport : transports) {
            System.out.printf(Locale.US, "%s: время %.2f ч, пассажиры %.2f руб., груз %.2f руб.%n",
                    transport.getType(), transport.getTime(distance),
                    transport.getPassengerCost(distance, passengers), transport.getCargoCost(distance, tons));
        }
    }

    // Классы этого задания собраны в одном файле для удобного запуска.
    public static class Airplane extends Transport {
        public Airplane() { super(800, 5, 50); }
        public String getType() { return "Самолет"; }
    }

    public static class Car extends Transport {
        public Car() { super(80, 3, 20); }
        public String getType() { return "Автомобиль"; }
    }

    public static class Ship extends Transport {
        public Ship() { super(40, 1, 5); }
        public String getType() { return "Корабль"; }
    }

    public static class Train extends Transport {
        public Train() { super(100, 2, 10); }
        public String getType() { return "Поезд"; }
    }

    public static abstract class Transport {
        private double speed;
        private double passengerRate;
        private double cargoRate;
        public Transport(double speed, double passengerRate, double cargoRate) {
            this.speed = speed;
            this.passengerRate = passengerRate;
            this.cargoRate = cargoRate;
        }
        public abstract String getType();
        public double getTime(double distance) { return distance / speed; }
        public double getPassengerCost(double distance, int passengers) {
            return distance * passengers * passengerRate;
        }
        public double getCargoCost(double distance, double tons) { return distance * tons * cargoRate; }
    }
}

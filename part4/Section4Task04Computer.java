// Часть 4, раздел 4, задание 4: компьютер
public class Section4Task04Computer {
    public static void main(String[] args) {
        Processor processor = new Processor("Учебный CPU", 4, 3.2);
        Memory memory = new Memory(16, "DDR4");
        Monitor monitor = new Monitor("Учебный монитор", 24);
        Computer computer = new Computer(Brand.LENOVO, processor, memory, monitor);
        System.out.println(computer);
        System.out.println("Объем памяти: " + computer.getMemory().getGigabytes() + " ГБ");
    }

    // Классы этого задания собраны в одном файле для удобного запуска.
    public enum Brand { LENOVO, ASUS, HP }

    public static class Computer {
        private Brand brand;
        private Processor processor;
        private Memory memory;
        private Monitor monitor;
        public Computer(Brand brand, Processor processor, Memory memory, Monitor monitor) {
            this.brand = brand;
            this.processor = processor;
            this.memory = memory;
            this.monitor = monitor;
        }
        public Brand getBrand() { return brand; }
        public Processor getProcessor() { return processor; }
        public Memory getMemory() { return memory; }
        public Monitor getMonitor() { return monitor; }
        public String toString() {
            return brand + "\n" + processor + "\n" + memory + "\n" + monitor;
        }
    }

    public static class Memory {
        private int gigabytes;
        private String type;
        public Memory(int gigabytes, String type) {
            this.gigabytes = gigabytes;
            this.type = type;
        }
        public int getGigabytes() { return gigabytes; }
        public String getType() { return type; }
        public String toString() { return "Память: " + gigabytes + " ГБ, " + type; }
    }

    public static class Monitor {
        private String model;
        private double inches;
        public Monitor(String model, double inches) {
            this.model = model;
            this.inches = inches;
        }
        public String getModel() { return model; }
        public double getInches() { return inches; }
        public String toString() { return "Монитор: " + model + ", диагональ=" + inches; }
    }

    public static class Processor {
        private String model;
        private int cores;
        private double frequency;
        public Processor(String model, int cores, double frequency) {
            this.model = model;
            this.cores = cores;
            this.frequency = frequency;
        }
        public String getModel() { return model; }
        public int getCores() { return cores; }
        public double getFrequency() { return frequency; }
        public String toString() { return "Процессор: " + model + ", ядер=" + cores + ", ГГц=" + frequency; }
    }
}

// Часть 4, раздел 4.1, задание 2: телефон
public class Section41Task02Phone {
    public static void main(String[] args) {
        Phone[] phones = {new Phone("111", "Модель A", 180),
                new Phone("222", "Модель B"), new Phone()};
        for (Phone phone : phones) {
            System.out.println(phone);
            System.out.println(phone.getNumber());
            phone.receiveCall("Иван");
            phone.receiveCall("Анна", "333");
            phone.sendMessage("444", "555");
        }
    }

    // Классы этого задания собраны в одном файле для удобного запуска.
    public static class Phone {
        private String number;
        private String model;
        private double weight;
        public Phone() { this("000", "Неизвестно", 0); }
        public Phone(String number, String model) {
            this.number = number;
            this.model = model;
        }
        public Phone(String number, String model, double weight) {
            this(number, model);
            this.weight = weight;
        }
        public String getNumber() { return number; }
        public void receiveCall(String name) { System.out.println("Звонит " + name); }
        public void receiveCall(String name, String callerNumber) {
            System.out.println("Звонит " + name + ", номер " + callerNumber);
        }
        public void sendMessage(String... numbers) {
            for (String recipient : numbers) {
                System.out.println("Сообщение для номера: " + recipient);
            }
        }
        public String toString() {
            return "Номер: " + number + ", модель: " + model + ", вес: " + weight + " г";
        }
    }
}

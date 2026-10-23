// Часть 4, раздел 4.1, задание 3: человек
public class Section41Task03Person {
    public static void main(String[] args) {
        Person[] people = {new Person(), new Person("Иван Петров", 18)};
        for (Person person : people) {
            System.out.println(person);
            person.move();
            person.talk();
        }
    }

    // Классы этого задания собраны в одном файле для удобного запуска.
    public static class Person {
        private String fullName;
        private int age;
        public Person() { this("Неизвестный", 0); }
        public Person(String fullName, int age) { this.fullName = fullName; this.age = age; }
        public void move() { System.out.println(fullName + " идет"); }
        public void talk() { System.out.println(fullName + " говорит"); }
        public String toString() { return fullName + ", возраст " + age; }
    }
}

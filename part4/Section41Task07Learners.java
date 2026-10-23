// Часть 4, раздел 4.1, задание 7: школьники и студенты
public class Section41Task07Learners {
    public static void main(String[] args) {
        Learner[] learners = {new Schoolchild("Иван", 9), new Student("Анна", "ИВТ-1"),
                new Schoolchild("Олег", 11), new Student("Мария", "ИВТ-2")};
        System.out.println("Студенты:");
        for (Learner learner : learners) {
            if (learner instanceof Student) System.out.println(learner);
        }
        System.out.println("Школьники:");
        for (Learner learner : learners) {
            if (learner instanceof Schoolchild) System.out.println(learner);
        }
    }

    // Классы этого задания собраны в одном файле для удобного запуска.
    public static class Learner {
        protected String name;
        public Learner(String name) { this.name = name; }
        public String toString() { return name; }
    }

    public static class Schoolchild extends Learner {
        private int grade;
        public Schoolchild(String name, int grade) { super(name); this.grade = grade; }
        public String toString() { return name + ", класс " + grade; }
    }

    public static class Student extends Learner {
        private String group;
        public Student(String name, String group) { super(name); this.group = group; }
        public String toString() { return name + ", группа " + group; }
    }
}

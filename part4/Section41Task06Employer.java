// Часть 4, раздел 4.1, задание 6: работник и менеджер
public class Section41Task06Employer {
    public static void main(String[] args) {
        Employer manager = new Manager("Анна", "Иванова", 50000, 60000);
        Employer[] employees = {new Employer("Иван", "Петров", 40000), manager};
        for (Employer employee : employees) {
            System.out.println(employee + ": годовой доход " + employee.getIncome());
        }
    }

    // Классы этого задания собраны в одном файле для удобного запуска.
    public static class Employer {
        protected String firstName;
        protected String lastName;
        protected double income;
        public Employer(String firstName, String lastName, double income) {
            this.firstName = firstName;
            this.lastName = lastName;
            this.income = income;
        }
        // income — месячная зарплата; возвращаем доход за 12 месяцев.
        public double getIncome() { return income * 12; }
        public String toString() { return firstName + " " + lastName; }
    }

    public static class Manager extends Employer {
        private double averageSum;
        public Manager(String firstName, String lastName, double income, double averageSum) {
            super(firstName, lastName, income);
            this.averageSum = averageSum;
        }
        @Override
        public double getIncome() { return super.getIncome() + averageSum; }
    }
}

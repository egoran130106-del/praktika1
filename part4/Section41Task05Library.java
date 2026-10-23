// Часть 4, раздел 4.1, задание 5: читатели библиотеки
public class Section41Task05Library {
    public static void main(String[] args) {
        Reader[] readers = {
            new Reader("Петров В. В.", 1, "Информатика", "01.01.2000", "111"),
            new Reader("Иванова А. А.", 2, "Математика", "02.02.2000", "222")
        };
        Book first = new Book("Приключения", "Автор А");
        Book second = new Book("Словарь", "Автор Б");
        Book third = new Book("Энциклопедия", "Автор В");
        for (Reader reader : readers) {
            System.out.println(reader);
            reader.takeBook(3);
            reader.takeBook("Приключения", "Словарь", "Энциклопедия");
            reader.takeBook(first, second, third);
            reader.returnBook(3);
            reader.returnBook("Приключения", "Словарь", "Энциклопедия");
            reader.returnBook(first, second, third);
        }
    }

    // Классы этого задания собраны в одном файле для удобного запуска.
    public static class Book {
        private String name;
        private String author;
        public Book(String name, String author) { this.name = name; this.author = author; }
        public String getName() { return name; }
        public String getAuthor() { return author; }
    }

    public static class Reader {
        private String fullName;
        private int cardNumber;
        private String faculty;
        private String birthDate;
        private String phone;
        public Reader(String fullName, int cardNumber, String faculty, String birthDate, String phone) {
            this.fullName = fullName;
            this.cardNumber = cardNumber;
            this.faculty = faculty;
            this.birthDate = birthDate;
            this.phone = phone;
        }
        public void takeBook(int count) { System.out.println(fullName + " взял " + count + " книги"); }
        public void returnBook(int count) { System.out.println(fullName + " вернул " + count + " книги"); }
        public void takeBook(String... names) {
            System.out.println(fullName + " взял книги: " + String.join(", ", names));
        }
        public void returnBook(String... names) {
            System.out.println(fullName + " вернул книги: " + String.join(", ", names));
        }
        public void takeBook(Book... books) {
            String[] names = new String[books.length];
            for (int i = 0; i < books.length; i++) names[i] = books[i].getName();
            takeBook(names);
        }
        public void returnBook(Book... books) {
            String[] names = new String[books.length];
            for (int i = 0; i < books.length; i++) names[i] = books[i].getName();
            returnBook(names);
        }
        public String toString() {
            return fullName + ", билет " + cardNumber + ", " + faculty + ", " + birthDate + ", " + phone;
        }
    }
}

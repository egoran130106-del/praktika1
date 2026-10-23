// Часть 2: класс Author по UML
public class TestAuthor {
    public static void main(String[] args) {
        Author author = new Author("Ivan Petrov", "ivan@example.com", 'M');
        System.out.println(author);
        System.out.println("Имя: " + author.getName());
        System.out.println("Почта: " + author.getEmail());
        System.out.println("Пол: " + author.getGender());
        author.setEmail("petrov@example.com");
        System.out.println("После изменения почты: " + author);
    }
}

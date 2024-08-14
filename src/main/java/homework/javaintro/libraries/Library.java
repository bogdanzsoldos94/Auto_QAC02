package homework.javaintro.libraries;

public class Library {
    public static void main(String[] args) {

        Author author = new Author("J.K. Rowling", "jkrowling@gmail.com");

        Book book = new Book("Harry Potter and the Philosopher's Stone", 1997, author, 39.99);

        System.out.printf("%s (%.2f RON), by %s> published in %d%n", book.getName(), book.getPrice(), book.getAuthor().getName(), book.getYear());
    }
}

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class App {
    static Logger log = LoggerFactory.getLogger(App.class);

    public static void main(String[] args) {
        Book book1 = new Book("123", "sdv", "Es", "50");
        Book book2 = new Book("235", "fre", "Ne", "100");

        Bookshelf bookshelf = new Bookshelf();
        bookshelf.add(book1);
        bookshelf.add(book2);

        bookshelf.getBooks().forEach(book -> log.info(book.getTitle()));

    }
}

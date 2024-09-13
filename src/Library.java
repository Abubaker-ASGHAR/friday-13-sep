import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

class Book {
    String title;
    String author;
    String genre;
    int yearPublished;

    public Book(String title, String author, String genre, int yearPublished) {
        this.title = title;
        this.author = author;
        this.genre = genre;
        this.yearPublished = yearPublished;
    }

    public String getTitle() {
        return title;
    }

    public String getGenre() {
        return genre;
    }

    public int getYearPublished() {
        return yearPublished;
    }

    @Override
    public String toString() {
        return title + " by " + author;
    }
}

public class Library {
    public static void main(String[] args) {
        List<Book> books = new ArrayList<>();
        books.add(new Book("The Wind-Up Bird Chronicle", "Haruki Murakami", "Fiction", 1997));
        books.add(new Book("Dune", "Frank Herbert", "Science Fiction", 1965));
        books.add(new Book("The Left Hand of Darkness", "Ursula K. Le Guin", "Science Fiction", 1969));
        books.add(new Book("The Road", "Cormac McCarthy", "Science Fiction", 2006));

        // Stream pipeline: Filter, sort, and collect
        List<String> sciFiBooks = books.stream()
                .filter(book -> book.getGenre().equalsIgnoreCase("science fiction"))
                .filter(book -> book.getYearPublished() > 2000)
                .sorted(Comparator.comparing(Book::getTitle))
                .map(Book::getTitle)
                .collect(Collectors.toList());


        List<String> sciFiBooks1 = books.stream()
                .filter(book -> book.getGenre().equalsIgnoreCase("science fiction"))
                .filter(book -> book.getYearPublished() > 2000)
                .sorted(Comparator.comparing(Book::getTitle))
                .map(book->book.getGenre())
                .collect(Collectors.toList());

        List <Book>  HM= books.stream().filter(book1 -> book1.author.equalsIgnoreCase("haruki murakami"))
                          .filter(book2-> book2.getYearPublished()<2000).collect(Collectors.toList());


        // Print the result
        HM.forEach(System.out::println);
        sciFiBooks.forEach(System.out::println);
        sciFiBooks1.forEach(System.out::println);

        //****************** Lambda to map each name to its length**********************
        List<String> names = Arrays.asList("Alice", "Bob", "Charlie");
        List<String> nameLengths = names.stream()
                .map(String::toUpperCase)
                .collect(Collectors.toList());

        nameLengths .forEach(System.out::println);
        //****************** optional*********************
        Optional<String> optionalValue = Optional.of("Hello, World!");

        // Check if value is present
        if (optionalValue.isPresent()) {
            System.out.println(optionalValue.get()); // Output: Hello, World!
        }

        // Provide a default value
        String value = optionalValue.orElse("Default Value");
        System.out.println(value); // Output: Hello, World!


    }
}
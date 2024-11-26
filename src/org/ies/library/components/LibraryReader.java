package org.ies.library.components;

import org.ies.library.model.Book;
import org.ies.library.model.Library;

import java.util.Scanner;

public class LibraryReader {
    private final Scanner scanner;
    private final BookReader bookReader;

    public LibraryReader(Scanner scanner, BookReader bookReader) {
        this.scanner = scanner;
        this.bookReader = bookReader;
    }

    public Library read() {
        System.out.println("¿Cuál es la biblioteca?");
        String name = scanner.nextLine();

        int howManyBooks;
        do{
            System.out.println("¿Cuántos libros tiene la biblioteca?");
            howManyBooks = scanner.nextInt();
        } while (howManyBooks < 1);

        Book[] books = new Book[howManyBooks];

        for (int i = 0; i < books.length; i++) {
            books[i] = bookReader.read();
        }

        return new Library(
          name,
          books
        );
    }
}

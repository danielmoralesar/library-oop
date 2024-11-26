package org.ies.library.components;

import org.ies.library.model.Author;
import org.ies.library.model.Book;

import java.util.Scanner;

public class BookReader {
    private final Scanner scanner;
    private final AuthorReader authorReader;

    public BookReader(Scanner scanner, AuthorReader authorReader) {
        this.scanner = scanner;
        this.authorReader = authorReader;
    }

    public Book read() {
        System.out.println("Ingrese los datos del libro");
        System.out.println("Ingrese el ISBN del libro: ");
        String isbn = scanner.nextLine();

        System.out.println("Ingrese el título del libro: ");
        String title = scanner.nextLine();

        System.out.println("Ingrese el año de publicación del libro:");
        int year = scanner.nextInt();
        scanner.nextLine();

        int howManyAuthors;

        do {
            System.out.println("¿Cúantos autores tiene el libro?");
            howManyAuthors = scanner.nextInt();

            if (howManyAuthors < 1) {
                System.out.println("Los libros deben tener mínimo un autor");
            }
        } while (howManyAuthors < 1);

        Author[] authors = new Author[howManyAuthors];

        for (int i = 0; i < authors.length; i++) {
            authors[i] = authorReader.read();
        }

        return new Book(
                isbn,
                title,
                year,
                authors
        );
    }
}

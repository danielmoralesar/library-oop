package org.ies.library.components;

import org.ies.library.model.Author;

import java.util.Scanner;

public class AuthorReader {
    private final Scanner scanner;

    public AuthorReader(Scanner scanner) {
        this.scanner = scanner;
    }

    public Author read(){
        System.out.println("Introduce los datos del autor");
        System.out.println("Introduzca el NIF del autor: ");
        String nif = scanner.nextLine();

        System.out.println("Introduzca el nombre del autor");
        String name = scanner.nextLine();

        System.out.println("Introduzca los apellidos de autor: ");
        String surName = scanner.nextLine();

        return new Author(
                nif,
                name,
                surName
        );
    }
}

package org.ies.library.model;

import java.util.Objects;

public class Author {
    private String nif;
    private String name;
    private String surName;

    public Author(String nif, String name, String surName) {
        this.nif = nif;
        this.name = name;
        this.surName = surName;
    }

    public String getNif() {
        return nif;
    }

    public void setNif(String nif) {
        this.nif = nif;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurName() {
        return surName;
    }

    public void setSurName(String surName) {
        this.surName = surName;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Author author = (Author) o;
        return Objects.equals(nif, author.nif) && Objects.equals(name, author.name) && Objects.equals(surName, author.surName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nif, name, surName);
    }

    @Override
    public String toString() {
        return "Author{" +
                "nif='" + nif + '\'' +
                ", name='" + name + '\'' +
                ", surName='" + surName + '\'' +
                '}';
    }
}

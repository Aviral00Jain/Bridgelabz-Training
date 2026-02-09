package com.designpatterns.bookcreation;

class Book {

    // Mandatory
    private final String title;

    // Optional
    private final String author;
    private final int edition;
    private final String genre;

    // Private constructor
    private Book(Builder builder) {
        this.title = builder.title;
        this.author = builder.author;
        this.edition = builder.edition;
        this.genre = builder.genre;
    }

    // Static Builder Class
    public static class Builder {

        // Mandatory
        private final String title;

        // Optional (default values)
        private String author;
        private int edition;
        private String genre;

        // Mandatory field via constructor
        public Builder(String title) {
            this.title = title;
        }

        public Builder author(String author) {
            this.author = author;
            return this;
        }

        public Builder edition(int edition) {
            this.edition = edition;
            return this;
        }

        public Builder genre(String genre) {
            this.genre = genre;
            return this;
        }

        public Book build() {
            return new Book(this);
        }
    }

    @Override
    public String toString() {
        return "Book [title=" + title +
               ", author=" + author +
               ", edition=" + edition +
               ", genre=" + genre + "]";
    }
}

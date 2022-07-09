package ru.job4j.pojo;

public class Library {
    public static void main(String[] args) {
        Book code = new Book("Clean code", 464);
        Book russianClassics = new Book("Crime and punishmenti", 567);
        Book java = new Book("Core Java, Volume I: Fundamentals", 1454);
        Book englishClassics = new Book("Jane Eyre", 490);
        Book[] books = new Book[4];
        books[0] = code;
        books[1] = russianClassics;
        books[2] = java;
        books[3] = englishClassics;
        for (int i = 0; i < books.length; i++) {
            Book bookObj = books[i];
            System.out.println(bookObj.getName() + " - " + bookObj.getPages());
        }
        Book tmp = books[0];
        books[0] = books[3];
        books[3] = tmp;
        for (int i = 0; i < books.length; i++) {
            Book bookObj = books[i];
            System.out.println(bookObj.getName() + " - " + bookObj.getPages());
            if ("Clean code".equals(bookObj.getName())) {
                System.out.println(bookObj.getName() + " - " + bookObj.getPages());
            }
        }

    }
}

package ru.arl;

public class ReaderMain {
    public static void main(String[] args) {

        String[] book = new String[3];
        book[0] = "Энциклопедия";
        book[1] = "Приключения";
        book[2] = "Словарь";

        int sumBook = book.length;
        System.out.println(sumBook);

        System.out.println("Петров В.В. взял "+sumBook+" книг");
        System.out.println("Петров В.В. взял "+book[0]+" ,"+book[1]+" ,"+book[2]);
    }
}

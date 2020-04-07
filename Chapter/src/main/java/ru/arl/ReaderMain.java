package ru.arl;

public class ReaderMain {
    public static void main(Reader[] args) {

        Reader[] readers = new Reader[3];
        readers[0] = new Reader();
        readers[1] = new Reader();
        readers[2] = new Reader();

        int sumBook = readers.length;
        System.out.println(sumBook);

        System.out.println("Петров В.В. взял "+sumBook+" книг");
        System.out.println("Петров В.В. взял "+readers[0]+" ,"+readers[1]+" ,"+readers[2]);
    }
}

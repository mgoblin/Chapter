package ru.arl.task4;

import java.util.Date;

public class ReaderMain {
    public static void main(Reader[] args) {

        Reader[] readers = new Reader[3];
        readers[0] = new Reader("Иванов Н.М.","1", "АРхфак",new Date(),"+79251248598" );
        readers[1] = new Reader("Петров Н.М.","1", "АРхфак",new Date(),"+79251248598");
        readers[2] = new Reader("Сидоров Н.М.","1", "АРхфак",new Date(),"+79251248598");

        int sumBook = readers.length;
        System.out.println(sumBook);

        System.out.println("Петров В.В. взял "+sumBook+" книг");
        System.out.println("Петров В.В. взял "+readers[0]+" ,"+readers[1]+" ,"+readers[2]);
    }
}

package ru.arl;

public class Main {
    public static void main(String[] args) {

        boolean[] akop = new boolean[100];
        for (int i = 0; i< akop.length; i=i+2){
            akop[i]= true;
        }
        for (int i=0; i<akop.length; i++) {
            System.out.println(akop[i]);
        }
    }
}

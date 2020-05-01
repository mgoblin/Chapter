package ru.arl.exceptions;

public class TryCatchFinally {

    public void run() throws Exception {
        System.out.println("Starting");
        throw new Exception("There is exception");
    }

    public static void main(String[] args) {
        TryCatchFinally program = new TryCatchFinally();
        try {
            program.run();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

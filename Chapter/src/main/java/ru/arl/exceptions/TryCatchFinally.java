package ru.arl.exceptions;

public class TryCatchFinally {

    public void run() throws Exception {
        System.out.println("Starting");
        throw new Exception("There is exception");
    }

    public static void main(String[] args) {
        try {
            TryCatchFinally program = new TryCatchFinally();
            program.run();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            System.out.println("Есть или нет Exception, а я выведу это сообщение");
        }
        System.out.println("Идем дальше");
    }
}

package ru.arl.generics;

public class BoxHandler {
    public void addsForAll(OperationsBox<?>[] boxes) {
        for (OperationsBox<?> box: boxes) {
            System.out.println(box.add());
        }
    }
}

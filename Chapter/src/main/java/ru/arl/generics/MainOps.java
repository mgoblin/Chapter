package ru.arl.generics;

public class MainOps {
    public static void main(String[] args) {
        String s1 = "S1";
        String s2 = "S1S2";

        OperationsBox<String> stringOperationsBox = new OperationsBox<>(s1, s2);
        System.out.println(stringOperationsBox.toString());
        System.out.println(stringOperationsBox.getOperand1());
        System.out.println(stringOperationsBox.getOperand2());

        Integer i1 = 1;
        Integer i2 = 2;
        OperationsBox<Integer> integerOperationsBox = new OperationsBox<>(i1, i2);
        System.out.println(integerOperationsBox.toString());
        System.out.println(integerOperationsBox.getOperand1());
        System.out.println(integerOperationsBox.getOperand2());

//        OperationsBox<String> stringBox = new StringBox(s1, s2);
//        System.out.println(stringBox.substract());
//
//        OperationsBox<Integer> integerBox = new IntegerBox(i1, i2);
//        System.out.println(integerBox.add());

    }
}

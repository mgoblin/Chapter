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

        Double d1 = 1.2;
        Double d2 = 3.4;
        OperationsBox<Double> doubleOperationBox = new OperationsBox<>(d1, d2);
        System.out.println(doubleOperationBox);
        System.out.println(doubleOperationBox.getOperand1());
        System.out.println(doubleOperationBox.getOperand2());

        String a1 = "Ruben";
        String a2 = "Akopyan";
        User ruben = new User(a1,a2);
        System.out.println(ruben);
//        OperationsBox<String> stringBox = new StringBox(s1, s2);
//        System.out.println(stringBox.substract());
//
//        OperationsBox<Integer> integerBox = new IntegerBox(i1, i2);
//        System.out.println(integerBox.add());

    }
}

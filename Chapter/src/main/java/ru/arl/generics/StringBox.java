package ru.arl.generics;

public class StringBox extends OperationsBox<String> {

    public StringBox(String operand1, String operand2) {
        super(operand1, operand2);
    }

    @Override
    public String add() {
        return operand1 + operand2;
    }

    @Override
    public String substract() {
        return operand1.replaceFirst(operand2, "");
    }
}

package ru.arl.generics;

public class IntegerBox extends OperationsBox<Integer> {

    public IntegerBox(Integer operand1, Integer operand2) {
        super(operand1, operand2);
    }

    @Override
    public Integer add() {
        return operand1 + operand2;
    }

    @Override
    public Integer substract() {
        return operand1 - operand2;
    }
}

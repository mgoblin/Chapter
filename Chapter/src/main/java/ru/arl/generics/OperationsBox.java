package ru.arl.generics;

import java.util.Objects;

public class OperationsBox<T> {
    protected final T operand1;
    protected final T operand2;

    public OperationsBox(T operand1, T operand2) {
        this.operand1 = operand1;
        this.operand2 = operand2;
    }

    public T getOperand1() {
        return operand1;
    }

    public T getOperand2() {
        return operand2;
    }

    public T add() {
        throw new UnsupportedOperationException();
    }

    public T substract() {
        throw new UnsupportedOperationException();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        OperationsBox<?> that = (OperationsBox<?>) o;
        return operand1.equals(that.operand1) &&
                operand2.equals(that.operand2);
    }

    @Override
    public int hashCode() {
        return Objects.hash(operand1, operand2);
    }

    @Override
    public String toString() {
        return "Operations{" +
                "operand1=" + operand1 +
                ", operand2=" + operand2 +
                '}';
    }
}
